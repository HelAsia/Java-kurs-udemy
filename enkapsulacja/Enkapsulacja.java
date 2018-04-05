package enkapsulacja;

public class Enkapsulacja {
	public static void main(String[] args) {
        /*
        Enkapsulacja (hermetyzacja) - pakowanie w³aœciwoœci w taki sposób,
                                     aby nie by³o do nich bezpoœredniego dostêpu 
                                     z innych klas
    */
		KontoBankowe oszczednosciowe = new KontoBankowe();
        oszczednosciowe.wplac(5000);
        
        if (oszczednosciowe.wyplac(4244))
        {
            System.out.println("wyp³acono");
        }
        else
            System.out.println("za ma³o kasy");
        
        
        System.out.println(oszczednosciowe.getSaldo());
	}
}

class KontoBankowe{
	public KontoBankowe(){
		saldo = 1000;
	}
	
	private int saldo;
	
	int getSaldo(){
		return saldo;
	}
	
	private boolean setSaldo(int saldo){
		/*
		 * WARUNKI !!!
		 */
		this.saldo = saldo;
		return true;
	}
	
	boolean wyplac(int ile)
    {
        if (saldo < ile)
            return false;
        else
            setSaldo(saldo - ile);
        
        return true;
    }
    boolean wplac(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }
}