package samouczekprogramistyzadania;

public class Main {
	public static void main (String [] args){
		MethodsTraining methodsTraining = new MethodsTraining();
		methodsTraining.yoursActualAge();
		System.out.println();
		methodsTraining.yourActualName();
		System.out.println();
		methodsTraining.addSubtractMultyply(methodsTraining.getNumberOne(), methodsTraining.getNumberTwo());
		System.out.println();
		methodsTraining.evenNumber(methodsTraining.getNumberOne());
	}
}
