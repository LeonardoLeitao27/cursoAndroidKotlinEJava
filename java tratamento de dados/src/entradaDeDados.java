import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número do tipo inteiro: ");
        int x = sc.nextInt();
        System.out.println("Seu número é: "+x);
    }
}
