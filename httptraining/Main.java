package httptraining;

import java.util.Scanner;

public class Main {
	public static void main (String [] args){
		
		Temperature temp = Temperature.getInstance();
		//Temperature temp = new Temperature();
		String city;

		System.out.println("Podaj miasto");  
		
		Scanner odczyt = new Scanner(System.in);
		city = odczyt.nextLine();
		
		double temperature;
		try {
			temperature = temp.getTemperature(city);
			System.out.println("Temperature in " + city + " is: " + temperature );
			
		} catch (Exception e) {
			System.out.println("You have problem with downloading temperature.");
		}
	
		odczyt.close();
	}
}