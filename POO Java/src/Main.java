public class Main {
    public static void main(String[] args) {
        pessoa p = new pessoa();
        // pessoa -> tipo do objeto (classe)
        // p -> objeto
        // o  espaço de memoria que é reservado para o objeto p
        System.out.println(p.str);

        p.falar();
    }
}