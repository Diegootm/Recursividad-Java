
public class Ejercicio23y24
{
   /* se define un numero de digitos incrementales a todo numero 
      natural n = dm ... d1 d0 talque di+1 es menor igual que di
      por ejemplo 1227, 359, 88, 139 son numeros de digitos 
      incrementales. escribe un proceso recursivo para decidri si un numero
      n es un numero de digitos incrementales
      '*/
   public boolean esIncremental(int numero){
       return esIncremental(numero/100, (numero/10)%10, numero%10);
   }
   private boolean esIncremental(int numero,int dimas, int di){
       boolean res;
       if(numero>0){
           if(dimas<= di){
               res = esIncremental(numero/10, numero%10, dimas);
           }else{
               res = false;
           }
       }else{
          res = true; 
       }
       return res;
   }
   /* considera el anterior ejercicio pero adaptalo para decidir si 
      un numero natural n es un numero de digitos decrementales*/
   public boolean esDecremental(int numero){
       return esDecremental(numero/100, (numero/10)%10, numero%10);
   }
   private boolean esDecremental(int numero,int dimas, int di){
       boolean res;
       if(numero>0){
           if(dimas>= di){
               res = esDecremental(numero/10, numero%10, dimas);
           }else{
               res = false;
           }
       }else{
          res = true; 
       }
       return res;
   }  
}
