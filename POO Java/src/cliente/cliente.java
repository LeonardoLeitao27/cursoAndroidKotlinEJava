package cliente;

public class cliente {
    private String nome;
    private int anoNascimento;
    //get set
    protected float consumo;

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoNascimento(int anoNascimento){
        if(anoNascimento<1950 || anoNascimento>2005){
           this.anoNascimento=0;
        }
        this.anoNascimento = anoNascimento;
    }
    //aula de get e set
   /* public void setAnoNascimento(int anoNascimento) throws Exception{
        if(anoNascimento<1950 || anoNascimento>2005){
            throw new Exception("O ano de nascimento está invalido");
        }
        this.anoNascimento = anoNascimento;
    } */
}

//Public não realiza restrições de acesso a variavéis e metodos.
//Private o atributo ou metodo fica disponivel somente a classe que pertence.
//Protected esta disponivel ao pacote a que pertence(pastar src).