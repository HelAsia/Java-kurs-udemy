package dziedziczenie.potwory;

public class Potwor {
    public double predkoscChodzenia;
    public double zywotnosc;
    
    public void atakuj()
    {
        /*
        
        */
        
        System.out.println("To jest metoda atakuj z klasy Potwor");
    }
    
    public Potwor()
    {
        System.out.println("Domyślny konstruktor z klasy Potwor");
    }
    public Potwor(double predkoscChodzenia, double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("NieDomyślny konstruktor z klasy Potwor");
    }    
    
}
