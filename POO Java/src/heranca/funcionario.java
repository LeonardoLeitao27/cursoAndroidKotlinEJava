package heranca;

public class funcionario {
     public String nome;
     protected int idade;
     protected float salario;
     protected float bonus;

     protected float horaExntra(int h, int f){
         return (h*1.5f)+(f*2f);
     }

}
