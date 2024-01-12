import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tratamentoDeExcecaoArquivos {
    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\leoce\\OneDrive\\Área de Trabalho\\codes\\cursoAndroidKotlinEJava\\java tratamento de dados\\src\\teste.txt";
        try {
            FileReader arquivoReader = new FileReader(caminhoArquivo);//destaca o caminho do arquivo a ser lido;
            BufferedReader leitor = new BufferedReader(arquivoReader);//realiza a otmização da leitura do arquivo;

            String linha;
            while ((linha = leitor.readLine())!=null){
                System.out.println(linha);
            }
            leitor.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
