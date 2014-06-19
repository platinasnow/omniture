package com.omniture.api;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

import com.omniture.www.Compatability;
import com.omniture.www.OmnitureWebServiceLocator;
import com.omniture.www.OmnitureWebServicePortType;

public class SaintClassification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			// Create an instance of the web service port class
			EngineConfiguration config = new FileProvider("src/com/omniture/api/omtr_api_config.wsdd");
			OmnitureWebServiceLocator service = new OmnitureWebServiceLocator(config);
			OmnitureWebServicePortType port = (OmnitureWebServicePortType) service.getOmnitureWebServicePort();
			
			String[] report_suite_array = new String[1];
			report_suite_array[0] = "<rsid>"; 
			String emailAddress = "<mail>";
			int relationId = 51; // comment for production
			// Identify which reports are enabled for classifications
			Compatability[] response = port.saintGetCompatabiltyMetrics(report_suite_array);
			for(int i=0;i<response.length;i++)
			{
				System.out.println(""+response[i].getRelation_id()+ " "+response[i].getRelation_name()+ " "+response[i].getReport_suite());
			}
			
			//*************************** Saint Import Job code block
			
			// Call Saint.ImportCreateJob to specify the parameters for the Import job and the header columns to be classified
			String[] header = new String[3];
			header[0] = "Key"; // This is mandatory
			header[1] = "Category"; 
			header[2] = "Brand";
			int importJobID = port.saintImportCreateJob(0, "Classifying data for JJEsquire", emailAddress, 0, header, 0, relationId, report_suite_array);
			System.out.println("Value of reportID from saintImportCreateJob is: "+importJobID);
			
			// Call Saint.ImportPopulateJob - Appends row data to an uncommitted SAINT Import Job
			com.omniture.www.Row[] rows = new com.omniture.www.Row[10];
			
			
			// Hard coding this for the demo application
			String[] row = new String[3];
			row[0] = "100241";
			row[1] = "Winter Ski Jackets";
			row[2] = "Northface";
			rows[0] = new com.omniture.www.Row();
			rows[0].setRow(row);

			System.out.println(row[0] + "\t" + row[1]);
			
			String responseImportPopulateJob = port.saintImportPopulateJob(importJobID, 1, rows);
			System.out.println("saintImportPopulateJob retuned a : "+responseImportPopulateJob);
			
			// Call Saint.ImportCommitJob - Returns status information about the files submitted to the specified data source. The status information tells you if the file is queued for processing, processing, or processed
			String responseImportCommitJob =port.saintImportCommitJob(importJobID);
			System.out.println("saintImportCommitJob retuned a : "+responseImportCommitJob);
			
			//*************************** Saint Import Job code block
			
			
			// Call Saint.ExportCreateJob -	Submits parameters to create an export file in SAINT. This file represents classifications for a given relation
			String responseExportCreateJob = port.saintExportCreateJob("", "", 0, "Dec 2010", "Dec 2010", "ritu.goyal@trilemetry.com", "", 51, report_suite_array, "", "", "", 0, 10);
			System.out.println("responseExportCreateJob retuned a : "+responseExportCreateJob);
			
			int checkCount = 0;
			int MAX_CHECKS = 40;
			int CHECK_INTERVAL = 6000; // 3 seconds
			Thread.sleep(CHECK_INTERVAL);
			com.omniture.www.Saintresult[] exportCreateJobStatus = port.saintCheckJobStatus(Integer.parseInt(responseExportCreateJob));
			while (!(exportCreateJobStatus[0].getStatus().equalsIgnoreCase("Completed") && exportCreateJobStatus[1].getStatus().equalsIgnoreCase("Ready"))){
				
				System.out.println("Current status for exportCreateJobStatus is: "+exportCreateJobStatus[0].getStatus());
				
				checkCount++;
				if(checkCount >= MAX_CHECKS)
					throw new Exception("Report timeout: report hasn't returned after " +
										MAX_CHECKS + " status checks");

				exportCreateJobStatus = port.saintCheckJobStatus(Integer.parseInt(responseExportCreateJob));
				if(!(exportCreateJobStatus[0].getStatus().equalsIgnoreCase("Completed") && exportCreateJobStatus[1].getStatus().equalsIgnoreCase("Ready")))
					Thread.sleep(CHECK_INTERVAL);
			}
			
			if(exportCreateJobStatus[0].getStatus().equalsIgnoreCase("Completed"))
			{
				System.out.println("Current status for exportCreateJobStatus within if loop is: "+exportCreateJobStatus[0].getStatus());
				System.out.println("Another status to check for exportCreateJobStatus within if loop: "+exportCreateJobStatus[1].getStatus());
				
				if(exportCreateJobStatus[1].getStatus().equalsIgnoreCase("Ready"))
				{
					String fileID = exportCreateJobStatus[1].getType();
					int viewablePages =  exportCreateJobStatus[1].getViewable_pages();
					
					System.out.println("File ID is: "+fileID+" and value of viewablePages is: "+viewablePages);

					for(int i=0;i<viewablePages;i++)
					{
						com.omniture.www.Pagedetail[] responseExportGetFileSegment = port.saintExportGetFileSegment(Integer.parseInt(fileID), i);
						System.out.println("responseExportGetFileSegment retuned the follwing headers: "+responseExportGetFileSegment[0].getHeader());
						System.out.println("responseExportGetFileSegment retuned the follwing data records: "+responseExportGetFileSegment[0].getData().length);
					}
				}
				
			} 
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
