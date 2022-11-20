package Ifood.bootcamp.MeContrata;

public class singletonErenYeager{

    private static singletonErenYeager erenYeager = new singletonErenYeager();


    private singletonErenYeager(){
        super();
    }
    public static singletonErenYeager titaDeAtaque(){
        return erenYeager;
    }
}