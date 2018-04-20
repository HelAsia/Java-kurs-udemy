package samouczekprogramistyzadania;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsTraining {

	public int yoursActualAge(){
		int yourAge;
		boolean checkGoodInput = false;
		
		while (checkGoodInput == false){
			System.out.println("What is your actual age?");
			try{
				Scanner dataFromUser = new 	Scanner(System.in);
				yourAge = dataFromUser.nextInt();
				System.out.println("Your actual age is: " + yourAge);
				try {
					System.in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
}
