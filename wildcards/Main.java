package wildcards;

import java.util.ArrayList;
import java.util.List;

class SuperClass{
    public static void tester(List<? extends Object> lista){
        
           /*? - wildcard - znak wieloznaczno��i
           ? extends JakasClassa - znak wieloznacznosci jest ograniczony klasa JakasClassa bounded wildcard
         */
    }
}
class SubClass extends SuperClass{
    
}

public class Main{

    public static void main(String[] args){
        /*
         * M�WI�, �E podk�adam za "E" : "String" we wszystkich deklaracjach/definicjach metod
         * Lista String�w
         * */
       List<String> listaStringow = new ArrayList<String>();
       
       //List<SuperClass> listaClass = new ArrayList<SuperClass>();
       List<SubClass> listaClass = new ArrayList<SubClass>();
      // listaClass.add(new SuperClass());
       listaClass.add(new SubClass());
       
       SuperClass.tester(listaStringow);
       
       /*
        �LE
        ArrayList<String> listaS = new ArrayList<String>();
       ArrayList<Object> listaO = listaS;
       
       listaO.add(new Integer(4));
       String a = (String) listaO.get(0);*/
       
    }
}