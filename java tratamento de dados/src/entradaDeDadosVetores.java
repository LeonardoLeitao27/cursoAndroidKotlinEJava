import java.util.Scanner;

public class entradaDeDadosVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho;
        System.out.println("Digite o tamanho do vetor");
        tamanho = sc.nextInt();

        int [] vetor = new int[tamanho];

        for (int i = 0;i<tamanho;i++){
            vetor[i] = sc.nextInt();
        }

        for (int i = 0;i<tamanho;i++){
            System.out.println(vetor[i]);
        }

    }
}
