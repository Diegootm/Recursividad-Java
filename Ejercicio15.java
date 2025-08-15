public class Ejercicio15
{
    /* escribe un proceso recursivo que permita decidir si un 
       numero natural n, es divisible entre 11, dado que se sabe 
       que un numero es divisble entre 11, si y solo si la suma de 
       digitos de posicion par menos la suma de la de los digitos de 
       posicion impar es un multipiplode 11*/
    public boolean esDivisible (int numero){
        return esDivisible(numero,0,0);
    }
    private boolean esDivisible(int numero,int pares, int impares){
        boolean res;
        if(numero==0){
            if((pares -impares) %11 == 0){
                res = true;
            }else{
                res = false;
            }
        }else{
            res= esDivisible(numero/100, pares +numero%10, impares +((numero%100)/10));
        }
        return res;
    }
}
