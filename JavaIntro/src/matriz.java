public class matriz {
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];

        for (int i =0;i<4;i++){
            for (int j = 0;j<4;j++){
                matriz[i][j] = 10;
            }
        }

        for (int i =0;i<4;i++){
            for (int j = 0;j<4;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
