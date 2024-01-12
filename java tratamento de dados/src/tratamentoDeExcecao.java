public class tratamentoDeExcecao {
    public static void main(String[] args) {
        String str = "ABC";

        try{
            System.out.println(str.charAt(3));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
