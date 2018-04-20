package samouczekprogramistyzadania;

public class Main {
	public static void main (String [] args){
		MethodsTraining methodsTraining = new MethodsTraining();
		Tables tables = new Tables();
		
		methodsTraining.yoursActualAge();
		System.out.println();
		
		methodsTraining.yourActualName();
		System.out.println();
		
		methodsTraining.addSubtractMultyply(methodsTraining.getNumberOne(), methodsTraining.getNumberTwo());
		System.out.println();
		
		methodsTraining.evenNumber(methodsTraining.getNumberOne());
		System.out.println();
		
		methodsTraining.threeFiveNumberDivisible(methodsTraining.getNumberOne());
		System.out.println();
		
		methodsTraining.powerOfNumber(methodsTraining.getNumberOne(),methodsTraining.getNumberTwo());
		System.out.println();
		
		methodsTraining.sqrtOfNumber(methodsTraining.getNumberOne());
		System.out.println();
		
		methodsTraining.rectangularTriangle(methodsTraining.getNumberOne(), methodsTraining.getNumberTwo(), methodsTraining.getNumberThree());
		System.out.println();
		
		tables.getFiveLetters();
		System.out.println();
	}
}

