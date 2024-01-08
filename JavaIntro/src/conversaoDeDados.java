public class conversaoDeDados {
    public static void main(String[] args) {
        String str = "100";
        System.out.println(1+(Integer.valueOf(str)));
        System.out.println(Byte.valueOf(str));
        System.out.println(Short.valueOf(str));
        System.out.println(Float.valueOf(str));
        System.out.println(Double.valueOf(str));
        System.out.println("______________________________________________");
        Byte b = 10;

        System.out.println(b.intValue());
        System.out.println(b.shortValue());
        System.out.println(b.floatValue());
        System.out.println(b.doubleValue());


    }
}
