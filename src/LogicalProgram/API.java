package LogicalProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class API {

	public static void main(String[] args) {
		try {
			String newurl="https://reqres.in/api/userspage";
			URL url=new URL(newurl);
//			URLConnection conn = url.openConnection();
//			InputStream is = conn.getInputStream();
//			String response = getStringFromInputStream(is);
//			System.out.println(response);
			
		HttpURLConnection	httpConn=(HttpURLConnection) url.openConnection();
		int responseCode = httpConn.getResponseCode();
		System.out.println(responseCode);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	
	 public static String getStringFromInputStream(InputStream is) {

		    BufferedReader br = null;
		    StringBuilder sb = new StringBuilder();

		    String line;
		    try {

		        br = new BufferedReader(new InputStreamReader(is));
		        while ((line = br.readLine()) != null) {
		            sb.append(line);
		        }

		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        if (br != null) {
		            try {
		                br.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }
		    System.out.println(sb.toString());
		    return sb.toString();
		   

		}

}
