package httptraining;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String [] args){
		
		String city;
		
		System.out.println("Podaj miasto");  
		
		Scanner odczyt = new Scanner(System.in);
		city = odczyt.nextLine();
		
		HttpRequestSender requestSender = new HttpRequestSender();
		TemperatureJson json = new TemperatureJson();
		boolean isTemperatureGot = false;
		
		while (isTemperatureGot == false){
			try {
				json.temperatureGetter(requestSender.responseGetter());
				isTemperatureGot = true;
			} catch (IOException e) {
				e.printStackTrace();
				isTemperatureGot = false;
			}
		}
		odczyt.close();
	}
	

}
