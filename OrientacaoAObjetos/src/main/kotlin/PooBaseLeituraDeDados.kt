class Pessoa_(val ano_nasc:Int, var nome:String){

    var idade = 2023 - ano_nasc
        fun saudacao(){
            println("Seja bem-vindo ${this.nome}")
        }
}

fun main() {
    println("Digite o ano que você nasceu:")
    var x = readlnOrNull()?.toInt()?:0
    println("Digite o seu nome completo:")
    var v = readln()
    println("Você está acordado?")
    var d = readlnOrNull().toBoolean()?: false

    var pessoa: Pessoa_ = Pessoa_(x,v)
    println(pessoa.ano_nasc)

    pessoa.saudacao()
}