
public class Ejercicio14
{
   /* escribre un metodo que permita saber si todos los digitos de un
      numero n, son pares*/
   public boolean digitosPares(int numero){
       boolean res;
       if(numero == 0){
           res = true;
       }else{           
           if((numero%10)%2 == 0){
               res = digitosPares(numero/10);
           }else{
               res = false;
           }
       }
       return res;
   }
}
