import java.util.ArrayList;
public class Ejericicio16
{
    /* se dice que n es un numero que explota cuando este explota
       en varios fragmentos mas chicos que el dada una bomba, si 
       se tiene que n es el numero y b la bomba, tales que n es 
       mayor que b se puede hacer que n explote en numeros n1 = n/b y n2 = n-(n/b)
       pero b es una bomba que produce una reaccion en cadena 
       si n1 o n2 son mayores que b esotso tambien explotan con la regla 
       anterior hasta que se encuentre que el numeor no es mayor que b, 
       entonces se dice que ya no se puede explotar el numero, por ejemplo
       si n = 10 y b=3 entoces n explota en los pedazos, 3,2,1,1 y 3 
       escribe un proceso que permita mostrar los pedazos del numero n,
       dado que se tiene la bomba b*/
    public ArrayList<Integer> numeroExplosivo(int n, int b){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(n>b){
            int n1 = n/b;
            int n2 = n-(n/b);
            res.addAll(numeroExplosivo(n1,b));
            res.addAll(numeroExplosivo(n2,b));
            // la funcion addAll sirve para ingresar un arreglo a otro areglo como si fuera un 
            // un arreglo fuente a destino
        }else{
            res.add(n);
            
        }
        return res;
    }
}
