/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokumentowanie;

/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika, jest to nadklasa dla...
 * opis
 * opis
 * opis
 * 
 * @author Arkadiusz W³odarczyk
 * @version 1.0.4.2 06/08/2015
 * @see dokumentowanie.Pracownik#getWynagrodzenie() 
 * @see <a href="http://forum.videokurs.pl" target="_blank">forum video kursów</a>
 * 
 */
public class Pracownik 
{
    /**
     * Konstruktor domyœlny
     */
    public Pracownik(){}
    /**
     * Konstruktor tworz¹cy obiekt <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imiê
     * @param nazwisko ustawia nazwisko
     * 
     */
    public Pracownik(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    /**
     * Konstruktor tworz¹cy obiekt <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imiê
     * @param nazwisko ustawia nazwisko
     * @param wynagrodzenie ustawia wynagrodzenie
     */
    public Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        this(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
    /**
     * <pre>
     * Jak u¿ywaæ:
     * 
     * Pracownik p = new Pracownik();
     * p.setWynagrodzenie(1000);
     * </pre>
     * @param noweWynagrodzenie - ustawia pracownikowi nowe wynagrodzenie
     */
    public void setWynagrodzenie(double noweWynagrodzenie)
    {
        this.wynagrodzenie = noweWynagrodzenie;
    }
    /**
     * @since 1.0.0.0     * 
     * @return zwraca pensje typu double w z³
     */
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    
    /**
     Imiê pracownika
    */
    private String imie;
    /**
     Nazwisko pracownika
    */    
    private String nazwisko;
    /**
     Wynagrodzenie pracownika w z³
    */    
    private double wynagrodzenie;
}
