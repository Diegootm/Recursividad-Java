
public class Ejercicio19
{
    /* escribir una solucion recursiva que calcule la funcion de Ackerman
       para valores m y n dados. la funcion de akerman se describe asi:
       A(m,n)= n + 1 si m = 0
       A(m,n)= A(m-1,1) + 1 si n = 0
       A(m,n)= A(m-1,A(m,n-1)) si me es mayor que 0 y n es mayor que 0*/
    public int a(int m, int n){
        int res;
        if(m == 0){
            res = n+1;
        }else if(n == 0){
            res = a(m-1,1);
        }else if(m > 0 && n > 0){
            res = a(m-1, a(m,n-1));
        }else{
            res = 0;
        }
        return res;
    }
}
