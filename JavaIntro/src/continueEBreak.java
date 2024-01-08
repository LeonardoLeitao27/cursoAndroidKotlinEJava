public class continueEBreak {
    public static void main(String[] args) {
        for(int i=0;i<=20;i++){
            if(i%2==0){
                continue; //Pular para a proxima chamada do for
            }
            System.out.println(i);
        }

        for(int i=0;i<=20;i++){
            if(i==10){
                break; //encerra o for
            }
            System.out.println(i);
        }

    }
}
