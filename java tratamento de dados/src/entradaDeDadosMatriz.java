import java.util.Scanner;

public class entradaDeDadosMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho;
        System.out.println("Digite o tamanho da matriz");
        tamanho = sc.nextInt();

        int [][] matriz = new int[tamanho][tamanho];

        for (int i = 0;i<tamanho;i++){
            for(int j = 0;j<tamanho;j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0;i<tamanho;i++){
            for(int j = 0;j<tamanho;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
}
