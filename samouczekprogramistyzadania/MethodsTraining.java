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
				dataFromUser.next();
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
	
	public int getNumberOne(){
		int numberOne;
		boolean checkGoodInput = false;
		
		while (checkGoodInput == false){
			System.out.println("Input first number");
			try{
				numberOne = dataFromUser.nextInt();
				checkGoodInput = true;
				return numberOne;
			}catch (InputMismatchException e) {
				System.out.println("Your first number has to be a number. Try again.");	
				System.out.println();
				checkGoodInput = false;
			}
		}
		return 0;
	}
	
	public int getNumberTwo(){
		int numberOne;
		boolean checkGoodInput = false;
		
		while (checkGoodInput == false){
			System.out.println("Input second number");
			try{
				numberOne = dataFromUser.nextInt();
				checkGoodInput = true;
				return numberOne;
			}catch (InputMismatchException e) {
				System.out.println("Your second number has to be a number. Try again.");	
				System.out.println();
				checkGoodInput = false;
			}
		}
		return 0;
	}
	
	public void addSubtractMultyply(int numberOne, int numberTwo){
		int add = numberOne + numberTwo;
		int subtract = numberOne - numberTwo;
		int multiply = numberOne * numberTwo;
		
		System.out.printf("%d + %d = %d%n", numberOne, numberTwo, add);
		System.out.printf("%d - %d = %d%n", numberOne, numberTwo, subtract);
		System.out.printf("%d * %d = %d%n", numberOne, numberTwo, multiply);
		
	}
	
	public boolean evenNumber(int numberOne){
		if(numberOne % 2 == 0){
			System.out.println("Your number is even");
			return true;
		}
		System.out.println("Your number is odd");
		return false;
	}
	
	public boolean threeFiveNumberDivisible(int numberOne){
		if(numberOne % 3 == 0 & numberOne % 5 == 0){
			System.out.println("Your number is divisible by 3 and 5");
			return true;
		}else if (numberOne % 3 == 0){
			System.out.println("Your number is divisible by 3 only");
			return false;
		}else if (numberOne % 5 == 0){
			System.out.println("Your number is divisible by 5 only");
			return false;
		}
		System.out.println("Your number is not divisible by 3 and 5");
		return false;
	}
}
