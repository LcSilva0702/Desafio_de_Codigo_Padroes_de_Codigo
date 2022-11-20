package Ifood.bootcamp.MeContrata;

public class singletonPreguicoso {
    
    private static singletonPreguicoso instancia;

    private singletonPreguicoso(){
        super();
    }

    public static singletonPreguicoso getSingletonPreguicoso(){
        if(instancia == null){
            instancia = new singletonPreguicoso();
        }
        
        return instancia;
    }
}
