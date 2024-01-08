public class estruturasDeDecisao {
    void media(float nota){
        if(nota>=7){
            System.out.println("Aprovado");
        }else if(nota>=4 && nota<=6.99){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
    public static void main(String[] args) {
        float a = 3.5f,b = 6.5f, c = 1f, d=3f;
        float media = (a+b+c+d)/4;
        new estruturasDeDecisao().media(media);
    }
}
