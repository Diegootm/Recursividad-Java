public class Ejercicio22
{
    /*escribir un proceso recursivo que muestre una piramide de digitos
       como se muestra en la siguiente figura
       1
       21
       321
       4321
       54321
       654321
       7654321
       87654321
       987654321
       */
    public String piramide(int hasta){
        String estado = "" ;
        return piramide(hasta,1, estado);
    }
    public String piramide(int hasta, int desde, String estado){
        String res;
        if(desde <=hasta){
            estado = desde + estado;
            res = estado + "/n" + piramide(hasta, desde+1,estado);
        }else{
            res = estado;
        }
        return res;
    }
      
}
