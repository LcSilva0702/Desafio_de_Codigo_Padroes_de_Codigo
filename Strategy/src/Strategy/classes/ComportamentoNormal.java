package Strategy.classes;

public class ComportamentoNormal implements Comportamento {
    
    @Override
    public void mover() {
        System.out.println("O Robo esta se movendo devagar");
    }
}
