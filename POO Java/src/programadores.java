public class programadores {
    public static void main(String[] args) {
        System.out.println(senioridade.JUNIOR.getId());

        for (senioridade s: senioridade.values()){
            System.out.println("O programador "+s+" deve ter "+ s.getId()+" ano de experiência");
        }
    }
}
