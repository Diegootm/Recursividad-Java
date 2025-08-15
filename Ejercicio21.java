
public class Ejercicio21
{
    /* implementar una solucion recursiva que calcule la suma de los primeros
       n numeros pares que no son multiplos de 4*/
    public int suma(int numero){
        return suma(numero, 1);
        
    }
    private int suma(int numero, int inicio){
        int res;
        if(inicio <= numero){
            if((inicio %2==0) && (inicio%4 != 0)){
                res = inicio + suma(numero, inicio+1);
            }else{
                res = 0 + suma(numero, inicio+1);
            }
        }else{
            res = 0;
        }
        return res;
    }
}
