package heranca;

public class gerente extends funcionario{
    @Override
    public void pagarImposto() {
        System.out.println("o gerente paga 15% de imposto");
    }
}
