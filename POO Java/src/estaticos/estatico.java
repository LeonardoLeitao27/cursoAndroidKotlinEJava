package estaticos;

public class estatico {
    protected static int contator=0;
    public static int o=10;
    public estatico(){
        contator++;
    }
    public static String mensagem(){
        return "olá, o seu nome é?";
    }

    public static void mensagem2(){
        System.out.println("aaaaaaaaaaaaaaa");
        int h = o;
        mensagem();
    }

}
