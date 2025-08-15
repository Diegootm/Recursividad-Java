public class Ejercicio3{
    /* Escribe un proceso recursivo que permita calcular la cantidad de digitos 
       que tiene un numero positivo n*/
    public int cantNumeros(int numero){
        int res;
        if(numero>0){
            res = 1 + cantNumeros(numero/10);
        }else{
            res = 0;
        }
        return res;
    }
}
