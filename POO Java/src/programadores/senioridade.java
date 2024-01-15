package programadores;

public enum senioridade {
    APRENDIZ(1),JUNIOR(4),PLENO(10),SENIOR(15),ESPECIALISTA(20);
    private int id;
    senioridade(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }
}
