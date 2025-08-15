
public class Ejercicio13
{
    /* se desea sumar los numeros primos de una secuencia de numeros */
    public int[] secuenciaNumeros;
    public Ejericicio13(int tam){
        this.secuenciaNumeros = new int[tam];
        
    }
    
    public int sumarPrimos(){
        return sumarPrimos(0);
    }
    private int sumarPrimos(int pos){
        int res;
        if(pos < secuenciaNumeros.length){
            if(esPrimo(secuenciaNumeros[pos])){
                res = secuenciaNumeros[pos]+ sumarPrimos(pos+1);
            }else{
                res = 0 + sumarPrimos(pos+1);
            }
        }else{
            res =0;
        }
        return res;
    }
    
    
    private boolean esPrimo(int numero){
        return esPrimo(numero,2);
        }
    private boolean esPrimo(int numero,int divisor){
        boolean res;
        if(divisor<= numero/2){
            if(numero % divisor == 0){
                res = false;
            }else{
                res = esPrimo(numero, divisor+1);
            }
        }else{
            res = true;
        }
        return res;
    }
       
}
