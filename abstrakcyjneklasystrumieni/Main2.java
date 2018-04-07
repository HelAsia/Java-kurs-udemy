package abstrakcyjneklasystrumieni;

import java.io.*;

public class Main2{
    public static void main(String[] args) throws IOException{
        
        File plik = new File("nazwaPliku.txt");
        File plik2 = new File("test.txt");
        InputStream inS;
        OutputStream outS;
        Reader reader;
        
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik)));
        Writer writer2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik2)));

        ((BufferedWriter)writer).write("lala");
        ((BufferedWriter)writer).newLine();
        ((BufferedWriter)writer).write("nastepna linia");
        
        ((BufferedWriter)writer).close();
        
        ((BufferedWriter)writer2).write("lala");
        ((BufferedWriter)writer2).newLine();
        ((BufferedWriter)writer2).write("nastepna linia");
        
        ((BufferedWriter)writer2).close();
        
        boolean ifEquals = plik2.equals(plik);
        System.out.println("We would like to check if both files are the same: " + ifEquals);
        
        String plikPath = plik.getAbsolutePath();
        String plik2Path = plik2.getAbsolutePath();
        System.out.println("Path to the plik is: " + plikPath);
        System.out.println("Path to the plik2 is: " + plik2Path);
        System.out.println(plik.getName());
        
    }
}
