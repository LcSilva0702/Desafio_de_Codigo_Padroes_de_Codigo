package Dio.Facade;

import Subsistema.Subsistema;
import Subsistema2.CepAPi;

public class Facade{
    
    public void migrarCliente(String nome, String cep){
        
        String cidade = CepAPi.correios().acharCidade(cep);
        String estado = CepAPi.correios().acharEstado(cep);
        
        Subsistema.gravarCliente(nome, cep, cidade, estado);
    }
}