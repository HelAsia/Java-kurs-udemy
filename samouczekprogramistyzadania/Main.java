package samouczekprogramistyzadania;

public class Main {
	public static void main (String [] args){
		MethodsTraining methodsTraining = new MethodsTraining();
		Tables tables = new Tables();
		
		methodsTraining.yoursActualAge();
		System.out.println();
		
		methodsTraining.yourActualName();
		System.out.println();
		
		methodsTraining.addSubtractMultyply(methodsTraining.getNumber(), methodsTraining.getNumber());
		System.out.println();
		
		methodsTraining.evenNumber(methodsTraining.getNumber());
		System.out.println();
		
		methodsTraining.threeFiveNumberDivisible(methodsTraining.getNumber());
		System.out.println();
		
		methodsTraining.powerOfNumber(methodsTraining.getNumber(),methodsTraining.getNumber());
		System.out.println();
		
		methodsTraining.sqrtOfNumber(methodsTraining.getNumber());
		System.out.println();
		
		methodsTraining.rectangularTriangle(methodsTraining.getNumber(), methodsTraining.getNumber(), methodsTraining.getNumber());
		System.out.println();
		
		tables.getFiveLetters();
		System.out.println();
		
		tables.invertedTable(methodsTraining.getNumber(), methodsTraining.getNumber(), methodsTraining.getNumber());
		System.out.println();
	}
}

