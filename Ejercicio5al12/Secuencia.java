/* Ejercicio5
 * disenia una clase secuencia que represente una secuencia de numeros 
 * enteros positivos*/
public class Secuencia{
    public int [] listaNumeros;
    public Secuencia(int [] listaNumeros){
        this.listaNumeros = listaNumeros;
    }
    // metodos
    // ejercicio6
    /* aniade un metodo que permita sumar los elementos de la secuecia*/
    public int sumarElementosSecuencia(){
        return sumarElementosSecuencia(0);
    }
    private int sumarElementosSecuencia( int pos){
        int res;
        if(pos<listaNumeros.length){
            res = listaNumeros[pos] + sumarElementosSecuencia(pos+1);
            
        }else{
            res =0;
        }
        return res;
    }
    
    // ejercicio 7
    /* aniade un metodo que permita encontrar el minimo elemento de la secuencia */
    public int numeroMinimo(){
        return numeroMinimo(1,listaNumeros[0]);
    }
    private int numeroMinimo(int posicion, int numero){
        int res;
        if(posicion<listaNumeros.length){
            if(numero> listaNumeros[posicion]){
                numero = listaNumeros[posicion];
                res = numeroMinimo(posicion+1,numero);
            }else{
                res = numeroMinimo(posicion+1,numero);
            }
        }else{
            res = numero;
        }
        return res;
    }
    
    // ejercicio8
    /* aniade un metodo que permita ordenar los elementos de la secuencia*/
    public int [] listaOrdenada(){
        int [] solucion = new int [listaNumeros.length];
        int [] auxi = listaNumeros.clone();
        return listaOrdenada(solucion, auxi,0);
    }
    private int [] listaOrdenada(int[] solucion, int[] auxi,int posicion){
        int [] res;
        if(posicion<solucion.length){
            solucion[posicion] = buscarNumeroMinimo(auxi,0,auxi[0]);
            auxi[posicionMinimo(auxi,0,auxi[0],0)] = Integer.MAX_VALUE;
            // el Integer.MAX_VALUE  sierve para dar un el numero mas grande 
            // que puede tener un int
            res = listaOrdenada(solucion, auxi, posicion+1);
        }else{
            res = solucion;
        }
        return res;
    }
    
    // estos son los metodos extras para que ordenemos la lista
    private int buscarNumeroMinimo(int [] auxi,int posicion, int numero){
        int res;
        if(posicion<auxi.length){
            if(numero> auxi[posicion]){
                numero = auxi[posicion];
                res = buscarNumeroMinimo(auxi, posicion+1, numero);
            }else{
                res = buscarNumeroMinimo(auxi,posicion+1,numero);
            }
        }else{
            res = numero;
        }
        return res;
    }
    private int posicionMinimo(int [] auxi,int posicion, int numero,int posicionMinimo){
        int res;
        if(posicion<auxi.length){
            if(numero> auxi[posicion]){
                numero = auxi[posicion];
                posicionMinimo = posicion;
                res = posicionMinimo(auxi,posicion+1,numero,posicionMinimo);
            }else{
                res = posicionMinimo(auxi,posicion+1,numero,posicionMinimo);
            }
        }else{
            res = posicionMinimo;
        }
        return res;
    }
    
    
    // ejercicio 9 
    // aniade un metodo que permita buscar un elemento x 
    public int buscarElemento(int x){
        return buscarElemento(x,0);
    }
    private int buscarElemento(int x, int posicion){
        int res;
        if(x <= listaNumeros.length ){
            res = 0;// ponemos 0 por que sobre paso el tamanio del array
            if(x == listaNumeros[posicion]){
              res = posicion;
            }
        }else{
            res = buscarElemento(x,posicion+1);
        }
        return res;
    }
    
    // ejercicio 10
    /* anaide un metodo a la clase secuencia que permita aplicar un
       fuctor f, un functor es una clase de objetos que tiene la finalidad de especifica
       funciones que se realizaran sobre elementos eneteros, cuenta con las operaicones 
       operar(int uno) y operar(int uno,int dos) amabs operaciones a su vez devuelven un int
       .por ejemplo se podria tener el functor multi que basicamente a traves de sus metodos 
       permite multiplicar elementos del tipo int*/
      
       
    // este es con el operador(int uno)
    public int [] operarLista(Functor f){
        int [] listaNew = new int [listaNumeros.length];
        return operarLista(f, listaNew, 0);
        
    }
    public int [] operarLista(Functor f, int [] listaNew,int pos ){
        int [] res;
        if(pos >= listaNumeros.length){
            res = listaNew;
        }else{
            listaNew[pos] = f.operar(listaNumeros[pos]);
            res = operarLista(f,listaNew, pos+1);
        }
        return res;
    }
    
    // este es con el operador (int uno, int dos)
    public int [] operarListaDos(Functor f){
        int [] listaNew = new int [(listaNumeros.length+1)/2];
        return operarListaDos(f, listaNew, 0);
        
    }
    public int [] operarListaDos(Functor f, int [] listaNew,int pos ){
        int [] res;
        if(pos == listaNumeros.length){
            res = listaNew;
        }else{
            if((pos*2)+1>= listaNumeros.length){
                listaNew[pos] = f.operar(listaNumeros[pos], 1);
                res = operarLista(f,listaNew, pos+1);
            }else{
               listaNew[pos] = f.operar(listaNumeros[pos], listaNumeros[pos+1]);
               res = operarLista(f,listaNew, pos+1); 
            }
        }
        return res;
    }
    
    // ejercicio 11 
    /* aniade un metodo que permita sumarlo con otra secuencia*/
    
    public int sumarOtraSecuencia(){
        return sumarOtraSecuencia(listaNumeros.length,0);
    }
    private int sumarOtraSecuencia(int tamanio, int pos){
        int res;
        if(pos < tamanio){
            res = listaNumeros[tamanio-pos] + sumarOtraSecuencia(tamanio, pos+1);
        }else{
            res =0;
        }
        return res; 
        
    }
    
    // ejercio 12 
    /*  bajo la suposcion ade que un objeto de la clase secuencia 
       se puede utilizar para representar un vecto, anaide un metodo a la clase
       secuencia que permita realizar producto escalr con toro vector
       */
      
    public int productoEscalar(int [] vectorA, int [] vectorB){
        return productoEscalar(vectorA, vectorB, 0);
    }
    private int productoEscalar(int [] vectorA, int [] vectorB, int pos){
        int res;
        if(vectorA.length == vectorB.length){
            if(pos < vectorA.length){
                res = (vectorA[pos]*vectorB[pos]) + productoEscalar(vectorA, vectorB, pos+1);
                
            }else{
                res = 0;
            }
        }else{
            res = 101010;// numero random por que los vectores no son del mismo tamanio
        }
        return res;
    }
    
    
    
    
}
