package abstrakcyjneklasystrumieni;

import java.io.*;

public class Main2 
{
    public static void main(String[] args) throws IOException 
    {
        
        File plik = new File("nazaPliku.txt");
        InputStream inS;
        OutputStream outS;
        
        Reader reader;
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik)));
      
        
        
        ((BufferedWriter)writer).write("lala");

        ((BufferedWriter)writer).newLine();
        ((BufferedWriter)writer).write("nastepna linia");
        
        ((BufferedWriter)writer).close();
    }
    
    void nazwaF(InputStream inS)
    {
        
    }
}
