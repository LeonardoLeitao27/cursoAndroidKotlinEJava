class Pessoa(val ano_nasc:Int, var nome:String){

    var idade = 2023 - ano_nasc
        fun saudacao(){
            println("Seja bem-vindo ${this.nome}")
        }
}

fun main() {
    var pessoa: Pessoa = Pessoa(24,"Neymar")
    println(pessoa.ano_nasc)

    pessoa.saudacao()
}