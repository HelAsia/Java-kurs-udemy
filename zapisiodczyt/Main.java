package zapisiodczyt;

import java.io.*;

public class Main 
{
    public static void main(String[] args)
    {
        try
        {
            PrintWriter drukarz = new PrintWriter(new FileWriter("dane.txt"));
            
            drukarz.println(1234);
            //drukarz.flush();
            drukarz.close();
            
            
            
            drukarz = new PrintWriter(new FileWriter("dane.txt", true));
            
            drukarz.append("lala");
            drukarz.println();
            drukarz.printf("On ma %d kg oraz %.2f %s wzrostu", 50, 165.456, "cm");
            
            drukarz.close();
            
            
            
            BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));
            
           // System.out.println((char)reader.read());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("baza.txt"));
            
            String tresc = "";
            while((tresc = reader.readLine()) != null)
            {
                writer.write(tresc);
                writer.newLine();
                System.out.println(tresc);
            }
                
            writer.close();
            reader.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
     
        //Main.test(1, 2, 4, 125, "lal", 4);
        
        

    }
    
    static void test(Object... a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
