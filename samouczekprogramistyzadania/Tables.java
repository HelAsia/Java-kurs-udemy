package samouczekprogramistyzadania;

public class Tables {
	
	public String[] getFiveLetters(){
		String [] fiveLetterTable = new String [5];
		fiveLetterTable[0] = "a";
		fiveLetterTable[1] = "b";
		fiveLetterTable[2] = "c";
		fiveLetterTable[3] = "d";
		fiveLetterTable[4] = "e";
		
		for(String letter : fiveLetterTable){
			System.out.println(letter);
		}
		return fiveLetterTable;
	}
	
	public int[] invertedTable(int a, int b, int c){
		int abc [] = new int [3];
		abc[0] = a;
		abc[1] = b;
		abc[2] = c;
		
		int cba [] = new int [3];
		for (int i = 0; i < abc.length; i++){
			cba [i] = abc [(abc.length - 1) - i];
		}
		for(int toDisplay : cba){
			System.out.println(toDisplay);
		}
		return cba;
	}

}
