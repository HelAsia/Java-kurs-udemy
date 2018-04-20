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

}
