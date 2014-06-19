package com.omniture.api;

import java.io.BufferedReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.description.TypeDesc;

import com.omniture.www.Data_warehouse_report;
import com.omniture.www.Data_warehouse_request;
import com.omniture.www.Dwsegment;
import com.omniture.www.OmnitureWebServiceLocator;
import com.omniture.www.OmnitureWebServicePortType;
import com.omniture.www.Report_suite_elements;
import com.omniture.www.Report_suite_metrics;

public class DataWarehouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			// Create an instance of the web service port class
			EngineConfiguration config = new FileProvider("src/com/omniture/api/omtr_api_config.wsdd");
			OmnitureWebServiceLocator service = new OmnitureWebServiceLocator(config);
			//service.setEndpointAddress("OmnitureWebServicePort", "https://api.omniture.com/admin/1.2/");
			OmnitureWebServicePortType port = (OmnitureWebServicePortType) service.getOmnitureWebServicePort();
			
			String reportSuiteId = "<rsid>"; 
			String contactName = "<id>"; 
			String contactPhone = "<phone>";
			String emailAddress = "<mail>"; 
			String[] rsid_list = new String[1];
			rsid_list[0] = reportSuiteId;
			
			// Return a list of Data Warehouse elements. Specify 1 (true) or 0 (false).
			Report_suite_elements[] elementData = port.reportSuiteGetAvailableElements(1, rsid_list);
			System.out.println("length of elementData: "+elementData.length);
			for(int i=0;i<elementData[0].getAvailable_elements().length;i++)
			{
			System.out.println("Elements in report suite are: "+elementData[0].getAvailable_elements()[i].getElement_name());
			}
			
			// Return a list of Data Warehouse elements. Specify 1 (true) or 0 (false).
			Report_suite_metrics[] metricData = port.reportSuiteGetAvailableMetrics(1, rsid_list);
			System.out.println("length of metricData: "+metricData.length);
			for(int i=0;i<metricData[0].getAvailable_metrics().length;i++)
			{
			System.out.println("Metrics in report suite are: "+metricData[0].getAvailable_metrics()[i].getMetric_name());
			}
			
			// Define the breakdown list 
			String[] breakdown_List = new String[4];
			breakdown_List[0] = "visitor_id";
			breakdown_List[1] = "visit_num";
			breakdown_List[2] = "ip";
			breakdown_List[3] = "next_page";
			
			// Define the metric list   
			String[] metric_List = new String[0];
			//metric_List[0] = "revenue";
			
			// Retrieve all the segment IDs in the report suite 
			Dwsegment[] segment_id = port.dataWarehouseGetSegments(reportSuiteId);
  		    System.out.println("Segment id is: "+segment_id[0].getId());
			
  		    // Send the Data Warehouse request 
			int reportID = port.dataWarehouseRequest(
				      breakdown_List, /* Breakdown List */
				      contactName, /* Contact Name */
				      contactPhone, /* Contact Phone */
				      "06/10/14", /* Date From */
				      "none", /* Date Granularity */
				      "", /* Date Preset */
				      "06/11/14", /* Date To */
				      "range", /* Date Type */
				      "Email_Test006", /* Email Subject */
				      emailAddress, /* Email To */
				      "/", /* FTP Dir */
				      "210.16.195.70", /* FTP Host */
				      "test123", /* FTP Password */
				      21, /* FTP Port */
				      "test01", /* FTP Username */
				      "report002", /* File Name */
				      metric_List, /* Metric List */
				      "DW API test (description)", /* Report Desc */
				      "DW API test (name)", /* Report Name */
				      0,
				      //segment_id[0].getId(), /* Segment Id */
				      reportSuiteId /* Report Suite Id */
			);
			// Check the report status, and keep checking periodically (if necessary)
			Thread.sleep(5000);
			Data_warehouse_request request = port.dataWarehouseCheckRequest(reportID);
			 
			// Get the report and print it
			// Sleep till the dataWarehouseCheckRequest method returns Waiting to Start or In Progress messages 
			while(request.getMessage().equalsIgnoreCase("Waiting to Start") || request.getMessage().equalsIgnoreCase("In Progress")) 
		    {
				Thread.sleep(10000);
				System.out.println("Waiting for completed status..."+request.getMessage());
				request = port.dataWarehouseCheckRequest(reportID);
		    }
			
			if(request.getMessage().equalsIgnoreCase("completed"))
			{
		    	//Data_warehouse_report reportResponse = port.dataWarehouseGetReportData(reportID, "gubler.jjesquire", 0);
				try {
		            /* Connect to the URL */
		            URL url = new URL( request.getData_url() );
		            URLConnection connection = url.openConnection();
		            /* Attach the Security Header (X-WSSE) */
		            connection.addRequestProperty("X-WSSE",  
		            		getSecurityHeader( "<userId>","<secret>" ));
		            connection.setDoOutput(false);
		 
		            /* Establish an InputStream/BufferedReader to read the report */
		            InputStream in = connection.getInputStream();
		            BufferedReader res = new BufferedReader(new InputStreamReader(in, "UTF-8"));
		 
		            /* Print each line of the report */
		            String inputLine;
		            while ((inputLine = res.readLine()) != null){
		                  System.out.println(inputLine);
		            }
		            res.close();
		 
		      } catch (Exception e) {
		            e.printStackTrace();
		      }
			}
			else
			{
			      System.out.println("DW Check, message = " + request.getMessage());
			}
				
		}
		catch(Exception e){
			e.printStackTrace();
		}	  
	}
	
	/**
	* Constructs the security header for Omniture REST requests.
	*
	 * The return value does not include the header name which is "X-WSSE"
	*
	 * Requires the Base64Coder class which can be retrieved at...
	*   http://www.source-code.biz/base64coder/java/Base64Coder.java.txt
	*
	 * @param apiUsername
	* @param apiSecret
	* @return the security header value
	* @throws java.io.UnsupportedEncodingException
	*/
	private static String getSecurityHeader(String apiUsername, String apiSecret) throws java.io.UnsupportedEncodingException {
	      /* Generate Nonce using the current time */
	      byte[] nonceB = Long.toString( new Date().getTime() ).getBytes();
	     
	      /* Base64 encode the Nonce */
	      String nonce = Base64Coder.encodeLines(nonceB);
	     
	      /* Generate the timestamp */
	      SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	      String created = dateFormatter.format(new Date());
	     
	      /* Generate the password disgest */
	      String password64 = "";
	      try {
	            MessageDigest messageDigester = MessageDigest.getInstance("SHA-1");
	            messageDigester.reset();
	            messageDigester.update( nonceB );
	            messageDigester.update( created.getBytes("UTF-8") );
	            messageDigester.update( apiSecret.getBytes("UTF-8") );
	            password64 = Base64Coder.encodeLines( messageDigester.digest() );
	      }catch (java.security.NoSuchAlgorithmException e) {
	            throw new RuntimeException(e);
	      }
	     
	      /* Construct the header String */
	      StringBuffer header = new StringBuffer("UsernameToken Username=\"");
	      header.append(apiUsername);
	      header.append("\", ");
	      header.append("PasswordDigest=\"");
	      header.append(password64.trim());
	      header.append("\", ");
	      header.append("Nonce=\"");
	      header.append(nonce.trim());
	      header.append("\", ");
	      header.append("Created=\"");
	      
	      header.append(created);
	      header.append("\"");
	      return header.toString();
	    
	}

}
