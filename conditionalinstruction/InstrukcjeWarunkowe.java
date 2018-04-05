package conditionalinstruction;

public class InstrukcjeWarunkowe {

	public static void main(String[] args){
		int a = 2,
			b = 5;
		
		if (a > b)
			System.out.println("a > b");
		else if (a < b){
			System.out.println("a < b");
			System.out.println("It is second option");
		}
		else{
		System.out.println("a = b");
		System.out.println("Third option");
		}
		
		
		char trySwitch = 50;
        switch(a)
        {
            case 50:
                System.out.println("a jest równe 50");
                break;
            case 100:
                System.out.println("a jest równe 100");    
                break;
            default:
                System.out.println("a nie jest równe ani 50 ani 100 jest równe " + a);
        }
        
        /*
        wyra¿enie ? tu piszemy co ma sie stac jesli wyrazenie to true : co ma sie stac jesli wyrazenie jest false;
        
    */
    
    int x = 5;
//    
//    if (x % 2 == 0)
//        System.out.println("parzysta");
//    else
//        System.out.println("nieparzysta");
//    
    
    String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
    
    System.out.println(czyParzysta);
        
	}
}
