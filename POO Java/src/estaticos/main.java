package estaticos;

public class main {
    public static void main(String[] args) {
        for (int i=0;i<11;i++){
            estatico.contator++;
        }
        new estatico();
        new estatico();
        new estatico();
        new estatico();
        System.out.println(estatico.contator);

        System.out.println(estatico.mensagem());
        estatico.mensagem2();
    }
}
