public class EscopoJava {
    static int valor=0;
    int value=0;

    public EscopoJava(){
        valor++;
        value++;
    }

    public static void main(String[] args) {
        new EscopoJava();
        new EscopoJava();
        new EscopoJava();
        new EscopoJava();

        EscopoJava s = new EscopoJava();
        System.out.println(s.valor); //pertence ao escopo classe, por isso incremente.
        System.out.println(s.value); // pertence ao escopo objeto.

        for(int i=0;i<4;i++){
            s.value++;
        }
        System.out.println(s.value);
    }
}
