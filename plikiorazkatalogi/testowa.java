package plikiorazkatalogi;

import java.io.*;

public class testowa {
	
	public static void main (String [] args){

		File fileToTesting = new File("testing.txt");
		File fileToTesting2 = new File("testing2.txt");
		try {
			if(!fileToTesting.exists()){
				fileToTesting.createNewFile();
			}
			
			BufferedWriter write = new BufferedWriter(new FileWriter (("testing.txt"), false) );
			
			write.write("something");
			write.newLine();
			write.write("something2");
			write.newLine();
			write.write("anything");
			write.newLine();
			
			write.close();
			
			if(!fileToTesting2.exists()){
				fileToTesting2.createNewFile();
			}
			BufferedReader read = new BufferedReader(new FileReader ("testing.txt"));
			BufferedWriter write2 = new BufferedWriter(new FileWriter (("testing2.txt"), false) );
			String text = "";
			while((text = read.readLine()) != null){
				write2.write(text);
				write2.newLine();				
			}
			write2.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
