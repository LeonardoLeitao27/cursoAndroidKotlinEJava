public class cliente {
    public String nome;
    private int anoNascimento;
    //get set
    protected float consumo;

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) throws Exception{
        if(anoNascimento<1950 || anoNascimento>2005){
            throw new Exception("O ano de nascimento está invalido");
        }
        this.anoNascimento = anoNascimento;
    }
}

//Public não realiza restrições de acesso a variavéis e metodos.
//Private o atributo ou metodo fica disponivel somente a classe que pertence.
//Protected esta disponivel ao pacote a que pertence(pastar src).