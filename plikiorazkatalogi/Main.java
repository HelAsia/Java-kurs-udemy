package plikiorazkatalogi;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main 
{
    public static void main(String[] args)
    {
        try 
        {
            File katalog = new File("video kursy"+File.separator+"php"+File.separator+"mysql");
            katalog.mkdirs();
            
            File plik2 = new File("video kursy"+File.separator+"php"+File.separator+"mysql", "lekcja1.txt");
            if (!plik2.exists())
                plik2.createNewFile();
            
            File plik = new File("test.txt");

            if (!plik.exists()) 
            {
                plik.createNewFile();
            }
            System.out.println("-----------"); 
            System.out.println(plik.getCanonicalPath());// kanoniczna, zawsze prawdziwa
            System.out.println(plik.getAbsolutePath());// absolutna doslowna sciezka
            System.out.println("-----------"); 
            System.out.println("Czy mogê pisaæ? :"+plik.canWrite());
            System.out.println("Czy mogê odpaliæ? :"+plik.canExecute());
            System.out.println("Czy mogê czytaæ? :"+plik.canRead());
            System.out.println("Czy jest ukryty? :"+plik.isHidden());
            System.out.println("Czy jest plikiem? :"+plik.isFile());
            System.out.println("Ostatnia modyfikacja :"+new Date(plik.lastModified()));
            System.out.println("D³ugoœæ pliku w bajtach (il. znaków): "+plik.length());
            System.out.println("-----------"); 
            Main.wypiszSciezki(new File(System.getProperty("user.dir")));
           // plik.delete();
        } 
        catch (IOException ex)
        {
           System.out.println(ex.getMessage());
        }
        
        
        //System.out.println(System.getProperty("user.dir"));
    }
    
    public static void wypiszSciezki(File nazwaSciezki)
    {
       String[] nazwyPlikowIKatalogow = nazwaSciezki.list();
       
       for (int i = 0; i < nazwyPlikowIKatalogow.length; i++)
       {
           File p = new File(nazwaSciezki.getPath(), nazwyPlikowIKatalogow[i]);
          
           //if (p.isFile()) aby znalezc tylko pliki
             
           
           if (p.isDirectory())
           {
               System.out.println(p.getPath());
               wypiszSciezki(new File(p.getPath()));
               
           }
       }
    }
}
