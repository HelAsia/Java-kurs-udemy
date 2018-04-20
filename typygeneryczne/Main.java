package typygeneryczne;

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<String> a = new ArrayList<String>();
        
        a.add(new String("lala"));
        a.add(new String("lala2"));
        a.add(new String("lala3"));
        a.add(new String("lala4"));
        a.add(new String("lala5"));
        a.add(new String("lala6"));
        
        
        //a.add(new Integer(4));
        
      /*  for (int i = 0; i < a.size(); i++)
            System.out.println((String)a.get(i));
        */
        for(String stringus : a)
            System.out.println(stringus);
        
        Zwykla<String> nazwaZmiennej = new Zwykla();
        nazwaZmiennej.nadajWartosc("cosik");
        System.out.println(nazwaZmiennej.zwroc());
    }
}
class Zwykla <COKOLWIEK>
{
    public void nadajWartosc(COKOLWIEK wartosc)
    {
        this.nazwaZmiennejTypuCokolwiek = wartosc;
    }
    public COKOLWIEK zwroc()
    {
        return this.nazwaZmiennejTypuCokolwiek;
    }
    COKOLWIEK nazwaZmiennejTypuCokolwiek;
}
