
public class Ejercicio17
{
    /* dado una cadena c escribir procesos recursivos para reolver cada uno
       de los siguientes ejercios
       a) contar la cantidad de veces que aparece un caracter x en c
       b) generar una cadena c1 equivale a la cadana c pero invertida
       c) contar la cantidad de vocales que hay c*/
       
       
    public int cantidadCaracter (String cadena, char x){
        return cantidadCaracter(cadena,x,0);
    }
    private int cantidadCaracter(String cadena, char x, int posicion){
        int res;
        if(posicion <= cadena.length()){
            if(x == cadena.charAt(posicion)){
                res = 1 + cantidadCaracter(cadena, x, posicion+1);
            }else{
                res = 0 + cantidadCaracter(cadena, x, posicion+1);
            }
        }else{
            res =0;
        }
        return res;
    }
    
    
    
    public String candenaInvertida(String cadena){
        String nuevo= "";
        return cadenaInvertida(cadena, nuevo, cadena.length());
    }
    private String cadenaInvertida(String cadena, String nuevo, int pos){
        String res;
        if(pos == 0){
            nuevo = nuevo + cadena.charAt(pos);
            res = nuevo;
        }else{
            nuevo = nuevo + cadena.charAt(pos);
            res = cadenaInvertida(cadena, nuevo, pos-1);
        }
        return res;    
    }
    
    public int contarVocales (String cadena){
        return contarVocales(cadena,0);
    }
    private int contarVocales(String cadena, int posicion){
        int res;
        if(posicion <= cadena.length()){
            if(cadena.charAt(posicion)== 'a' || cadena.charAt(posicion)== 'e'|| cadena.charAt(posicion)== 'i'|| cadena.charAt(posicion)== 'o'||cadena.charAt(posicion)== 'u'){
                res = 1 + contarVocales(cadena, posicion+1);
            }else{
                res = 0 + contarVocales(cadena, posicion+1);
            }
        }else{
            res =0;
        }
        return res;
    }
    
    
}
