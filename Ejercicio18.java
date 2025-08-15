
public class Ejercicio18
{
    /* difinimos un numero promedio de un numero entero positivo
       al numero que se obtiene de sumar sus digitos de posiciones pares
       y restar sus digitos de posiciones impares. Escribir un planteo recursivo
       que permita obtenr el numero promedio de un entero positivo dado 
       */
      
    public int numeroPromedio(int numero){
        return numeroPromedio(numero,0,0);
    }
    
    private int numeroPromedio(int numero, int suma, int posicion){
        int res;
        if(numero>0){
            if(posicion%2 ==0 ){
                suma = suma + numero%10;
                res = numeroPromedio(numero/10, suma, posicion+1);
            }else{
                suma = suma -numero%10;
                res = numeroPromedio(numero/10, suma, posicion+1);
            }
        }else{
            res = suma;
        }
        return res;
    }
}
