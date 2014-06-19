package com.omniture.api;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;
import com.omniture.www.*;


public class Reporting {

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
		    
			// Define the report
			ReportDescription reportDescription = new ReportDescription();
			reportDescription.setReportSuiteID("<rsid>"); 
			reportDescription.setSegment_id("<segmentid>");
			reportDescription.setDateTo("14-01-01");
			reportDescription.setDateFrom("14-05-30");
			reportDescription.setLocale(ReportDefinitionLocale.ko_KR);
			
			
			// Set the metric to totalRevenue - look at this link for options - https://developer.omniture.com/documentation/reporting/resources/metrics
			ReportDefinitionMetric[] reportDefinitionMetric = new ReportDefinitionMetric[4];
			reportDefinitionMetric[0] = new ReportDefinitionMetric();
			reportDefinitionMetric[0].setId("orders");
			reportDefinitionMetric[1] = new ReportDefinitionMetric();
			reportDefinitionMetric[1].setId("units");
			reportDefinitionMetric[2] = new ReportDefinitionMetric();
			reportDefinitionMetric[2].setId("visitors");
			reportDefinitionMetric[3] = new ReportDefinitionMetric();
			reportDefinitionMetric[3].setId("visits");
			//ReportDefinitionMetric[] metrics = { reportDefinitionMetric };
			reportDescription.setMetrics(reportDefinitionMetric);
			
			
			// Set the element to product to pull a product report - look at this link for options  - https://developer.omniture.com/documentation/reporting/resources/elements
			ReportDefinitionElement[] reportDefinitionElement = new ReportDefinitionElement[1];
			reportDefinitionElement[0] = new ReportDefinitionElement();
			reportDefinitionElement[0].setId("visitNumber");
			reportDefinitionElement[0].setTop(20);
			
			//reportDefinitionElement[0].setClassification("brand");
			
			//ReportDefinitionElement[] elements = { reportDefinitionElement };
			reportDescription.setElements(reportDefinitionElement);
			
			// The API method determining which type of report to queue, there are 3 types of reports (Overtime, Trended, Ranked) 
			ReportQueueResponse response = port.reportQueueRanked(reportDescription);
					//port.reportQueueTrended(reportDescription);
					//port.reportQueueOvertime(reportDescription);
			
			/* Store the report response in reportID variable */
			int reportID = response.getReportID();
			System.out.println("Report ID is: "+reportID);
			
			// Check the report status, and keep checking periodically (if necessary)
			Thread.sleep(2000);
			Report_status status = port.reportGetStatus(reportID);
			System.out.println("Got after reportGetStatus!"+status.getStatus());
			
			// counters for checking status 
			int checkCount = 0;
			int maxChecks = 20;
			
			// Repeatedly check on request in the queue (using Report.GetStatus) 
			while (!status.getStatus().equals("done"))
			{
				System.out.println("status: " + status.getStatus());
				if(! status.getStatus().equals("done") && ! status.getStatus().equals("ready"))
					throw new Exception("Unexpected status: " + status.getStatus() + ", " +
					status.getError_msg());
				checkCount++;
				if(checkCount >= maxChecks)
					throw new Exception("Report timeout: report hasn't returned after " + maxChecks + "checks");
				status = port.reportGetStatus(reportID);
				if(!status.getStatus().equals("done"))
					Thread.sleep(2000);
			}
			// Check is the status of report is done 
			if(status.getStatus().equals("done"))
			{
				// Store the report response in reportResponse 
				ReportResponse reportResponse = port.reportGetReport(reportID);
				// Get the report 
				Report report = reportResponse.getReport();
				// Get the report data 
				ReportData[] reportData = report.getData();
				System.out.println("Is there data in the report? "+reportData.length);
				// Loop over report data length and retrieve individual records 
				for (int j = 0; j < reportData.length; j++) 
				{
					System.out.print(reportData[j].getName());
					double[] counts = reportData[j].getCounts();
					for (int k = 0; k < counts.length; k++) 
					{
						System.out.print(" - " + counts[k]);
					}
					System.out.println("");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
