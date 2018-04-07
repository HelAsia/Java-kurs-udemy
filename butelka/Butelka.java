package butelka;

class ZaMaloWody extends Exception
{

    public ZaMaloWody(String string) {
        super(string);
    }
    
}
public class Butelka {
    private double ileLitrow;

    Butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }
    
    double getIleLitrow()
    {
        return ileLitrow;
    }
    void wlej(double ilosc)
    {
        this.ileLitrow += ilosc;
    }
    void wylej(double ilosc) throws ZaMaloWody
    {
        if (ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else
            throw new ZaMaloWody("Za ma³o wody");
        
    }
    
    void przelej(double ilosc, Butelka gdziePrzelac) throws ZaMaloWody
    {
        this.wylej(ilosc);      
        gdziePrzelac.wlej(ilosc);
       
    }
    
  
    public static void main(String[] args) 
    {
        Butelka k = new Butelka(5);
        Butelka k2 = new Butelka(10);
        
        try
        {
            k.przelej(20, k2);
        }
        catch(ZaMaloWody ex)
        {
            System.out.println(ex.getMessage());
        }
        
        
        int a = 10;
        
        try
        {
            System.out.println(5/0);
            if (a == 10)
                      throw new NaszWyjatek("a jest rowne 10, grzeszysz");            
        }
        catch(NaszWyjatek ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        try
        {
            System.out.println(5/1);
            
            
           
        }
        catch(Exception ex)
        {
            System.out.println("Powsta³ wyj¹tek: " + ex.getMessage());
        }
        finally
        {
            System.out.println("COS CO ZAWSZE ZOSTANIE WYWOLANE");
        }
        
        System.out.println("cokolwiek");
        
        /*
            try
            {
                //INSTRUKCJE KTORE POTENCJALNIE MOGA SPOWODOWAC BLAD
            }
            catch(NazwaZwrconegoWyjatku nazwazmiennej)
            {
                //INSTRUKCJE OBSLUGUJACE ZLAPANY WYJATEK
            }
        
        */
        
    }
    
 
    
}

class NaszWyjatek extends Exception
{

    public NaszWyjatek(String string) {
        super(string);
    }
    
}