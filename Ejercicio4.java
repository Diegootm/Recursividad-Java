import java.util.ArrayList;
public class Ejercicio4{
    /* se desea encontrar los factores primos de un numero n */ 
    
    public ArrayList<Integer> factoresPrimos(int numero){
        ArrayList<Integer> factores = new ArrayList<Integer>();
        return factoresPrimos(numero,1, factores);
    }
    
    public ArrayList<Integer> factoresPrimos(int numero,int divisor, ArrayList<Integer> factores){
        ArrayList<Integer> res;
        if(divisor <= numero){
            if(numero % divisor == 0 && esPrimo(divisor)){
                factores.add(divisor);
                res = factoresPrimos(numero/divisor, divisor+1,factores);
                
            }else{
                res = factoresPrimos(numero, divisor+1, factores);
            }
        }else{
            res = factores;
        }
        return res;
    }
    
    // para verificar que el factor es primo
    private boolean esPrimo(int numero){
        return esPrimo(numero, 2);
    }
    public boolean esPrimo(int numero, int divisor){
        boolean res;
        if(divisor <= (numero/2)){
            if(numero % divisor == 0){
                res= false;
            }else{
                res = esPrimo(numero, divisor+1);
            }
        }else{
            res = true;
        }
        return res;
    }
}
