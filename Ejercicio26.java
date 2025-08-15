public class Ejercicio26
{
    /* Escribir un proceso recursivo para reconocer si una cadena
       dada es de la forma anbn, es decir n a's consecutivas seguidas de n b's 
       consecutivas*/    
    public boolean es_anbn(String cadena){
        return es_anbn(cadena, cadena.length()-1, 0);
    }
    private boolean es_anbn (String cadena, int tamanio, int contador){
        boolean res;
        if(tamanio>=0){
            if(cadena.charAt(tamanio)== 'b'){
                res = es_anbn(cadena, tamanio-1, contador+1);
            }else{
                res = es_anbn(cadena, tamanio-1, contador-1);
            }
        }else{
            res = (contador == 0) ? true : false;
        }
        return res;
    }
}
