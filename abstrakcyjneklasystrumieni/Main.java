package abstrakcyjneklasystrumieni;

import java.io.*;

public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        InputStream inS;
        OutputStream outS;
        
        Reader reader;
        Writer writer = new FileWriter("nazaPliku.txt");
        
        writer.write("lala");
        
        writer.close();
    }
    
    void nazwaF(InputStream inS)
    {
        
    }
}
