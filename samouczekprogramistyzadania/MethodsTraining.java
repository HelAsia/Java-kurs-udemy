package samouczekprogramistyzadania;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsTraining {
	Scanner dataFromUser = new 	Scanner(System.in);

	public int yoursActualAge(){
		int yourAge;
		boolean checkGoodInput = false;
		
		while (checkGoodInput == false){
			System.out.println("What is your actual age?");
			try{
				
				yourAge = dataFromUser.nextInt();
				System.out.println("Your actual age is: " + yourAge);
			
				checkGoodInput = true;
				return yourAge;
			}catch(InputMismatchException e){
				System.out.println("Your age has to be a number. Try again.");	
				System.out.println();
				checkGoodInput = false;
			}
		}
		return 0;	
	}
	
	public String yourActualName(){
		String yourName;
		
		System.out.println("What is your actual name?");
		
			Scanner dataFromUser = new 	Scanner(System.in);
			yourName = dataFromUser.nextLine();
			System.out.println("Your actual name is: " + yourName);
			
			return yourName;
	}
}
