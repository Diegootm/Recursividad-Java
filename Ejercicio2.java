public class Ejercicio2{
    /* Escribe un proceso recursivo que permita decidir si un numero
       n es primo o no*/
    public boolean esPrimo(int numero){
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
