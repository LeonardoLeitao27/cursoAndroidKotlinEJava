package aulaInterface;

public class computador implements maquina, teste{
    @Override
    public void ligar() {
        System.out.println("ligando");
    }

    @Override
    public void desligar() {
        System.out.println("desligando");
    }

    @Override
    public void testar() {
        System.out.println("realizando reste");
    }
}
