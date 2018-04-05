package anonimowecwiczenie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AnonimowaKlasaCwiczenie {
	
	public static void main (String[] args){
		String word;
		List<String> listOfStrings = new ArrayList<String>();
		
		for(int i = 0; i < 6; i++){
			System.out.println("Enter word");
			Scanner read = new Scanner(System.in);
			
			word = read.nextLine();
			
			listOfStrings.add(word);
		}
		
		System.out.println("List before sorting" + listOfStrings);
		
		Comparator criteria = new Comparator(){

			@Override
			public int compare(Object a1, Object b1) {
				String a = (String) a1;
				String b = (String) b1;
				
				if(a.length() < b.length())
					return -1;
				else if(a.length() > b.length())
					return 1;
				
				return 0;
		}};
		
		Collections.sort(listOfStrings, criteria);
		System.out.println("List after sorting" + listOfStrings);
	}
}