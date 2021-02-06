package interview.Singleton;

public class SingleTone {

    private static SingleTone instancOfSingleton=null;

    public static SingleTone SingleTone(){

        if(instancOfSingleton==null){
            instancOfSingleton=new SingleTone();
        }
        return instancOfSingleton;
    }

    
}
