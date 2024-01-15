package heranca;

public class main {
    public static void main(String[] args) {
        operario op = new operario();
        op.nome="leonardo";
        op.idade=24;
        op.salario=1200;
        op.bonus=300f;
        float h = op.horaExntra(10,10);

        System.out.println("O ganho mensal do funcionario "+op.nome +" é de " + (op.salario+op.bonus+h));
    }
}
