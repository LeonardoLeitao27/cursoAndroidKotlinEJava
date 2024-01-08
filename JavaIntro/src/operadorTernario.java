public class operadorTernario {
    //expressão ? true: false;
    String maiorDeIdade(int idade){
        return (idade>=18) ? "maior de idade" : "Menor de idade";
        /*
        if(idade >=18){
            return "Maior de idade";
        }else{
            return "Menor de idade";
        } */
    }
    public static void main(String[] args) {
        int x = 17;
        String z = new operadorTernario().maiorDeIdade(x);
        System.out.println(z);
    }
}
