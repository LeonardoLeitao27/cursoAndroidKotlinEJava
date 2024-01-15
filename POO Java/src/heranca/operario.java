package heranca;

public class operario extends funcionario{
    @Override
    public void pagarImposto() {
        System.out.println("o operario paga 7% de imposto");
    }

    @Override
    public void saudacao(){
        System.out.println("olá teste operario");
    }
}
