fun a(valor:Any){
    //Any recebe qualquer tipo de variavel
    println(valor)
}

fun b():Unit{
    //Com o Unit estamos declarando que está função não irá ter nenhum retorno
    println("Função sem retorno")
}

fun c():Nothing{
    // Ele retorna um tratamento de exceção
    // Caso tivermos alguma função incompleta, utilizamos o Nothing para informar onde parou determinado procedimento.
    TODO("Função ainda a ser completada")
    //   return "leo"
}
fun main() {
    a(10)
    b()
    c()
}