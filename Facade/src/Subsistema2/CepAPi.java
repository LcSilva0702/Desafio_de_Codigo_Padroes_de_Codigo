package Subsistema2;

public class CepAPi {
    private static CepAPi isntancia = new CepAPi();

    private CepAPi(){
        super();
    }
    public static CepAPi correios(){
        return isntancia;
    }
    public String acharCidade(String cep){
        return "Caxias" ;
    }
    public String acharEstado(String cep){
        return "Rj";
    }

}
