public class ifAninhado {
    public static void main(String[] args) {
        int v = 6;
            if(v%2==0){
                if(v%3==0){
                    System.out.println("Divisivel por 6");
                }else {
                    System.out.println("O número é par");
                }
            }else{
                System.out.println("O numero não é par");
            }
    }
}
