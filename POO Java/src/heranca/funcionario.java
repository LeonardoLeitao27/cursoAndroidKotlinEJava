package heranca;

public abstract class funcionario{
     //usando o final na classe ela não consegue mais fazer a herança
     //usando o final em uma variavel ela se torna imutavel
     //usando o final em metodos eles não podem ser sobreescritos com o override
     public String nome;
     protected int idade;
     protected float salario;
     protected float bonus;

     public abstract void pagarImposto();

     protected float horaExntra(int h, int f){
         return (h*1.5f)+(f*2f);
     }

     public void saudacao(){
          System.out.println("olá");
     }
}
