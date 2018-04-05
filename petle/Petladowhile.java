package petle;

public class Petladowhile {
	
	public static void main (String[] args){
	
		String [] kursyProgramowania = 
			{
				"Java", 
	            "Java Aplikacje", 
	            "Java Strumienie",
	            "Java Aspekty Zaawansowane", 
	            "Java Android",
	            "C#", 
	            "C# Tworzenie Aplikacji",
	            "C# LINQ",
	            "Pascal"	
			};
		
		// while
		int i = 0;
		while (i < kursyProgramowania.length){
			System.out.println(kursyProgramowania[i]);
			i++;
		}
		
		// do... while
		System.out.println();
		int j = 0;
		do{
           System.out.println(kursyProgramowania[j]);
           j++; 
        }while(j < kursyProgramowania.length);
		
		//for
		System.out.println();
		for(int k = 0; k < kursyProgramowania.length; k++){           
            System.out.println(kursyProgramowania[k]);           
        }

		//for ulepszona
		System.out.println();
	    for(String nazwaKursu: kursyProgramowania){
	          System.out.println(nazwaKursu);
	    }
	
	    // pêtla w pêtli
	    System.out.println();
	    for (int j1 = 1; j1 <= 10; j1++){
            for (int i1 = 1; i1 <= 10; i1++){
                System.out.print(i1 * j1 + " ");
            }
            System.out.println();
        }
	    
	    //continue
	    System.out.println();
	    for (int i2 = 0; i2 < 60; i2++){
	        if (i2 % 2 != 0)
	        	continue; //przerwij iteracje od tego momentu i nie wykonuj ju¿ ¿adnych instrukcji po mnie
	                
	            System.out.println(i2);
	    }
	    
	    //break
	    System.out.println();
	    for (int i3 = 0; i3 < 60; i3++){
	        if (i3 % 2 != 0)
	        	break; //przerwij iteracje od tego momentu i nie wykonuj ju¿ ¿adnych instrukcji po mnie
	                
	            System.out.println(i3);
	    }
	}
}
