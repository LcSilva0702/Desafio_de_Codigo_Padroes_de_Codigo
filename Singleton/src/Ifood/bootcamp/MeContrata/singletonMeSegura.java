package Ifood.bootcamp.MeContrata;

public class singletonMeSegura {
    
    private static class meSolta{
        public static singletonMeSegura toCaindo = new singletonMeSegura();    
    }

    private singletonMeSegura(){
        super();
    }

    public static singletonMeSegura queroBrigar(){
        return meSolta.toCaindo;
    }
}
