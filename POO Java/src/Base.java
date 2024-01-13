public class Base {
    public static void main(String[] args) {
        try{
            cliente c = new cliente();
            c.nome = "Leonardo";
            c.consumo = 1090f;
            c.setAnoNascimento(1999);

            System.out.println("O nome iformado é: " + c.nome);
            System.out.println("O consumo de "+ c.nome +" foi " + c.consumo);
            System.out.println("O ano de nascimento é " + c.getAnoNascimento());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
