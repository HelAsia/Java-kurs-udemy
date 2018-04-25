package httptraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainingHttp {
	
	public static void main (String [] args) throws IOException{
		String beginning;
		String ending;
		String city;
		String urlString;
		
		System.out.println("Podaj miasto");  
		
		Scanner odczyt = new Scanner(System.in);
		city = odczyt.next();
		
		beginning = "http://openweathermap.org/data/2.5/weather?q=";
		ending = "&appid=b6907d289e10d714a6e88b30761fae22";
		
		urlString = beginning + city + ending;
		//System.out.println(urlString);
		
		URL url = new URL (urlString);
		
		//URL url = new URL ("http://openweathermap.org/data/2.5/weather?q=Wroclaw&appid=b6907d289e10d714a6e88b30761fae22");
		
		// Ustawiamy nasze proxy (TYLKO NA POTRZEBY DEBUGOWANIA!)
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
	
		// Otwiera po³¹czenie
		HttpURLConnection con = (HttpURLConnection) url.openConnection(proxy);
		
		// Wysy³a metodê ¿¹dania
		con.setRequestMethod("GET");
		con.setRequestProperty("Content-Type", "application/json");
		System.out.println("Everything is correct");
		
		
		/*// Otwiera map'ê z parametrami
		Map<String, String> parameters = new HashMap <>();
		
		// dodaje pierwszy parametr do map'y
		parameters.put("q", "Wroclaw");
		
		// dodaje drugi parametr do map'y
		parameters.put("appid", "b6907d289e10d714a6e88b30761fae22");
		
		// true przy post i put, false przy get
		con.setDoOutput(true);*/
			
		/*
		 * Tylko gdy chcê u¿yæ ¿¹dania POST!!!
		 * 
		 * DataOutputStream out = new DataOutputStream(con.getOutputStream());
		out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
		out.flush();
		out.close();*/
				
		String contentType = con.getHeaderField("Content-Type");
		
		con.setConnectTimeout(5000);
		con.setReadTimeout(5000);
	
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(
				new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null){
			response.append(inputLine);
		}
		in.close();
		
		/*System.out.println("Wys³ano ¿¹danie pod adres: " + url);
        System.out.println("Kod odpowiedzi: " + responseCode);
        System.out.println("OdpowiedŸ:");
        System.out.println(response.toString());*/
		
		String html = response.toString();
		
		Temperature temp = new Temperature();
		temp.temperature(city, html);
        
        
        //System.out.println("You temperature is: ");
        
        
        //System.out.println("Your temperature is: " + html.substring(tempIndex, pressureIndex));
        
	}
	
}


