public class funcoes {
    // funções com retorno eu devo informar o tipo de dados e tbm devo informar se tem parametros ou não
    // função sem retorno - void - com ou sem parametros

    void hello(){
        System.out.println("Olá mundo!");
    }

    void hello(String nome){
        System.out.println("Olá "+ nome);
    }

    String chegada(){
        //função sem parametro e com retorno
        return "Olá";
    }
    public static void main(String[] args) {
        new funcoes().hello();
        new funcoes().hello("Leonardo");
        String a = new funcoes().chegada();
        System.out.println(a);

    }
}
