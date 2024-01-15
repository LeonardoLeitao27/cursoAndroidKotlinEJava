package cliente;

public class Base {
    public static void main(String[] args) {

        cliente c = new cliente();
        c.setNome("Leonardo");
        c.consumo = 1090f;
        c.setAnoNascimento(1999);

        System.out.println("O nome iformado é: " + c.getNome());
        System.out.println("O consumo de "+ c.getNome() +" foi " + c.consumo);
        System.out.println("O ano de nascimento é " + c.getAnoNascimento());

       // cliente.cliente c2 = c; //Está apontando para o primeiro objeto
        cliente c2 = new cliente();
        c2.setNome("LeoLeo");
        System.out.println("Pessoa 1: " +  c.getNome() + " Pessoa 2: " + c2.getNome());


        //aula de get e set
        /*
        try{
            cliente.cliente c = new cliente.cliente();
            c.nome = "Leonardo";
            c.consumo = 1090f;
            c.setAnoNascimento(1999);

            System.out.println("O nome iformado é: " + c.nome);
            System.out.println("O consumo de "+ c.nome +" foi " + c.consumo);
            System.out.println("O ano de nascimento é " + c.getAnoNascimento());
        }catch (Exception e){
            System.out.println(e);
        } */
    }
}
