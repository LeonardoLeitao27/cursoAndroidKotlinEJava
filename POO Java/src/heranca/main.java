package heranca;

public class main {
    public static void main(String[] args) {
        funcionario f1 = new gerente();
        funcionario f2 = new operario();
        polimorfismo(f1);


    }
    private static void polimorfismo(funcionario f){
        f.pagarImposto();
    }
}
