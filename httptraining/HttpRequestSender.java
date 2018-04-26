package httptraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HttpRequestSender{
	String city;
	
	public String getCity(){
		System.out.println("Podaj miasto");  
		
		Scanner odczyt = new Scanner(System.in);
		city = odczyt.nextLine();

		odczyt.close();
		return city;
	}

	public URL getUrl(String city){
		
		String beginning = "http://openweathermap.org/data/2.5/weather?q=";
		String ending = "&appid=b6907d289e10d714a6e88b30761fae22";
		String urlString;
		URL url = null;

		urlString = beginning + city + ending;
		try {
			url = new URL (urlString);
		} catch (MalformedURLException e) {
			System.out.println("Your URL is wrong.");
			e.printStackTrace();
		}

		return url;
	}

	public String responseGetter() throws IOException  {
		//Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
		
		String inputLine;
		StringBuffer response = new StringBuffer();
		HttpURLConnection con = (HttpURLConnection)getUrl(getCity()).openConnection();

		con.setRequestMethod("GET");
		con.setRequestProperty("Content-Type", "application/json");
		con.setConnectTimeout(5000);
		con.setReadTimeout(5000);

		BufferedReader in = new BufferedReader(
				new InputStreamReader(con.getInputStream()));
		
		while ((inputLine = in.readLine()) != null){
			response.append(inputLine);
		}
		
		in.close();
		return response.toString();
	}
}


