
public class Multiplicacion implements Functor
{
    @Override
    public int operar(int uno){
        return uno *2;
        
    }
    
    @Override 
    public int operar(int uno, int dos){
        return uno *dos;
    }
}
