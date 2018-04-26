package httptraining;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String [] args){
		
		Temperature temp = new Temperature();
		String city;

		System.out.println("Podaj miasto");  
		
		Scanner odczyt = new Scanner(System.in);
		city = odczyt.nextLine();
		
		double temperature = temp.getTemperature(city);
		
		if (temperature == 0.0){
			System.out.println("You have problem with downloading temperature.");
		}
		System.out.println("Temperature in " + city + " is: " + temperature );
	
		odczyt.close();
	}
}