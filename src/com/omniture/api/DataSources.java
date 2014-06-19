package com.omniture.api;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.omniture.www.Ds_generic_settings;
import com.omniture.www.Ds_setup_result;
import com.omniture.www.FileIDResult;
import com.omniture.www.FileStatusResult;
import com.omniture.www.OmnitureWebServiceLocator;
import com.omniture.www.OmnitureWebServicePortType;
import com.omniture.www.SimpleDataSource;

public class DataSources {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			// Create an instance of the web service port class
			EngineConfiguration config = new FileProvider("src/com/omniture/api/omtr_api_config.wsdd");
			OmnitureWebServiceLocator service = new OmnitureWebServiceLocator(config);
			OmnitureWebServicePortType port = (OmnitureWebServicePortType) service.getOmnitureWebServicePort();
			
			String reportSuiteID = "<rsid>"; 
			
			// Informational methods - dataSourceGetIDs and dataSourceGetInfo 
			// These return information about the data sources associated with the specified report suite.
			SimpleDataSource[] responsedataSourceGetIDs = port.dataSourceGetIDs(reportSuiteID);
			com.omniture.www.DataSourceInfo[] responsedataSourceGetInfo = port.dataSourceGetInfo("",reportSuiteID);
			System.out.println("Name of data source in responsedataSourceGetInfo is: "+responsedataSourceGetInfo[0].getName());
			for(int i=0; i<responsedataSourceGetIDs.length;i++)
			{
				System.out.println("The data source id is: "+responsedataSourceGetIDs[i].getDataSourceId()+" and the data source name is: "+responsedataSourceGetIDs[i].getDataSourceName());
				
			}
			
			// Use the value that you retrieved in the dataSourceGetInfo method above, or set it to 0 for creating new data sources.
			int dataSourceID = 0;  // set to 0 to create a new data source
			String dataSourceName = "PurchaseOfflineViaCallCenter";
			/* Generic Data Source - Transaction ID(Integration) = 32
			   The ID of 32 lets you tie offline events to an online event. The transaction ID acts as a key betwen the offline and online events. */
			int dataSourceType = 32; // Identifier for Generic Summary type of DataSources with Transaction ID
			
			Ds_generic_settings dataSourceSettings = new Ds_generic_settings();
			dataSourceSettings.setDataSourceName(dataSourceName);
			dataSourceSettings.setDataSourceEmail("sh.in@theuber.co.kr"); 
			
			String[] metricNames = new String[1];
			metricNames[0] = "Offline Revenue";
			dataSourceSettings.setMetricNames(metricNames);
			
			String[] metricEvents = new String[1];
			metricEvents[0] = "event 2";
			dataSourceSettings.setMetricEvents(metricEvents);
			
			String[] dimensionNames = new String[1];
			dimensionNames[0] = "Products";
			dataSourceSettings.setDimensionNames(dimensionNames);
			
			String[] dimensionVariables = new String[1];
			dimensionVariables[0] = "Product";
			dataSourceSettings.setDimensionVariables(dimensionVariables);
			
			/* DataSource.SetupGeneric - creates a new DataSource (type Generic) */
		    Ds_setup_result responsedataSourceSetupGeneric = port.dataSourceSetupGeneric(dataSourceID, dataSourceSettings, dataSourceType, reportSuiteID);
		    System.out.println("The ID of the new Data Source is: "+responsedataSourceSetupGeneric.getDataSourceID());
		    dataSourceID = responsedataSourceSetupGeneric.getDataSourceID();
			
			// Sleep 3 minutes while the FTP space is being provisioned
			Thread.sleep(360000);// 180000 for production
			
			// DataSource.BeginDataBlock - Submits the first HTTP data block in the current Data Sources data submission
			String blockName = "OfflineRevenueBlock1";
			String[] columnNames = new String[4];
			columnNames[0] = "Date";
			columnNames[1] = "Product";
			columnNames[2] = "Event 2";
			columnNames[3] = "transactionID";
			
			String[][] rows = new String[][]{{"1/13/2011","100302","455","003456"},
					{"1/14/2011","100303","455","003456"}};
			
			// Set the endOfBlock to an empty string to signify end of block and set it to false to continue appending data.
			String endOfBlock = "false";
			javax.xml.rpc.holders.IntHolder blockID = new javax.xml.rpc.holders.IntHolder();
			javax.xml.rpc.holders.IntHolder fileID = new javax.xml.rpc.holders.IntHolder();
			javax.xml.rpc.holders.StringHolder status = new javax.xml.rpc.holders.StringHolder(); 
			port.dataSourceBeginDataBlock(blockName, columnNames, Integer.toString(responsedataSourceSetupGeneric.getDataSourceID()), endOfBlock, reportSuiteID, rows, blockID, fileID, status);
			Thread.sleep(3000);
			System.out.println("Returned value of blockID is: "+blockID.value+" and status is: "+status.value);
			
			//DataSource.AppendDataBlock - Appends an additional HTTP data block to a Data Sources data submission.
			rows = new String[][]{{"1/11/2011","100300","455","003456"},
					{"1/12/2011","100301","455","003456"}};
			
			port.dataSourceAppendDataBlock(blockID.value, Integer.toString(responsedataSourceSetupGeneric.getDataSourceID()), endOfBlock, reportSuiteID, rows, fileID, status);
			System.out.println("Returned value of blockID is: "+blockID.value+" and status is: "+status.value);
			
			// DataSource.GetFileIDs
			FileIDResult responsedataSourceGetFileIDs = port.dataSourceGetFileIDs(Integer.toString(dataSourceID), "", reportSuiteID);
			System.out.println("Status of responsedataSourceGetFileIDs is: "+responsedataSourceGetFileIDs.getStatus().getMessage());
			
			FileStatusResult responsedataSourceGetFileStatus = port.dataSourceGetFileStatus(Integer.toString(dataSourceID), reportSuiteID);
			System.out.println("Status of responsedataSourceGetFileStatus is: "+responsedataSourceGetFileStatus.getStatus());
		
		//	Status responsedataSourceRestart = port.dataSourceRestart(dataSourceID, reportSuiteID);
		//	System.out.println("Status of responsedataSourceRestart is: "+responsedataSourceRestart.getMessage());
			
		//	Status responsedataSourceDeactivate = port.dataSourceDeactivate(dataSourceID, reportSuiteID);
		//	System.out.println("Status of responsedataSourceDeactivate is: "+responsedataSourceDeactivate.getMessage());
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
