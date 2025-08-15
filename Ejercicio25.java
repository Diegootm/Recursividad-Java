public class Ejercicio25
{
    /* definimos inverso simple de una secuencia de caracters, al 
       inverso de la secuencia sin sus repeticiones consecutivas
       por ejemplo el inveso simple de aaabccdddaaeebb es beadcba,
       escribe un proceso recursivo para obtener un inverso simple 
       de una secuencia de caracteres*/
    public String inverso(String cadena){
        String nuevo = "" + cadena.charAt(0);
        return inverso(cadena, cadena.length(), cadena.charAt(0),1,nuevo);
    }
    private String inverso(String cadena, int tamanio, char letra,int pos, String nuevo){
        String res;
        if(pos<tamanio){
            if(cadena.charAt(pos) == letra){
                res = inverso(cadena, tamanio, letra, pos+1,nuevo);
            }else{
                nuevo = cadena.charAt(pos) + nuevo;
                letra = cadena.charAt(pos);
                res = inverso(cadena, tamanio, letra, pos+1, nuevo);
            }
        }else{
            res = nuevo;
        }
        return res;
    }
}
