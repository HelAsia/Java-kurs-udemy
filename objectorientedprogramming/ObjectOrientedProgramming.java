package objectorientedprogramming;

public class ObjectOrientedProgramming {

	 public static void main(String[] args) {
        /*
            Objects - containers that stores variables and functions thematically 
                      connected to each other for easier future usage
            Classes - blueprint for creating instances (copies) of objects      
            
            Properties - features (part of something)
            Methods - functions
        */

        
        Test a = new Test();
        
        a.printSomethingOut("Arek", "W這darczyk");
        a.printSomethingOut("Viola", "W這darczyk");
        a.printSomethingOut("Viola", "W這darczyk");
        a.printSomethingOut("Viola", "W這darczyk");
        a.printSomethingOut("Viola", "W這darczyk");
        a.printSomethingOut("Viola", "W這darczyk");
        
        double result = a.divide(100, 2);
        
        System.out.println(result);
    }   
	}

	class Test{
	    void printSomethingOut(String name, String surname){
	        System.out.println("Name: " + name);
	        System.out.println("Surname " + surname);
	    }
	    
	    int add(int x, int y){
	        return x + y;
	    }
	    
	    double divide(double x, double y){
	        if (y == 0){
	        	System.out.println();
	        	System.out.println("You can't divide by zero");
	            return 0;
	        }else{
	        	System.out.println();
	        	System.out.println("Your result is: ");
	        return x / y;
	        } 
	    }
	}