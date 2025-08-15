
public class Ejercicio20
{
    /* escribe una solucion recursiva que retorne verdadero si una palabra
       es palindromo (es una palabra palindromo cuando se puede leerse igual
       de izquiera a derecha que de derecha a izquierda)*/
    public boolean esPalindromo(String palabra){
        String nuevo = "";
        return esPalindromo(palabra, nuevo,palabra.length()-1);
    }
    
    private boolean esPalindromo(String palabra, String nuevo, int pos){
        boolean res;
        if(pos>=0){
            nuevo = nuevo + palabra.charAt(pos);
            res = esPalindromo(palabra, nuevo, pos-1);
        }else{
            if(palabra.equals(nuevo)){
                res = true;
            }else{
                res = false;
            }
        }
        return res;
    }
    
    
}
