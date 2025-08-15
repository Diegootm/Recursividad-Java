
public class Suma implements Functor
{
    @Override
    public int operar(int uno){
        return uno +1;
        
    }
    
    @Override 
    public int operar(int uno, int dos){
        return uno +dos;
    }
}
