package agregacja;

public class Agregacja 
{

    public static void main(String[] args) 
    {
        Pracownik p = new Pracownik("Arek", new Adres("Proszowska", 92));
    
        System.out.println(p);
    }
    
}

class Pracownik
{
    String imie;
    Adres adres;
    
    //Praca praca;

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return this.imie + ": " + adres.ulica + " " + adres.nrDomu;
    }
    
    
}

class Adres
{
    String ulica;
    int nrDomu;

    public Adres(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }
    
    
}