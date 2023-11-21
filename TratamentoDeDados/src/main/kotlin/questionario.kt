import kotlin.math.sqrt

fun main() {
    val numero = -4.0
    try {
        val resultado2 = sqrt(numero)
        if(numero < 0)
        {throw IllegalArgumentException() }
        println ("Resultado: $resultado2") }
    catch (e: IllegalArgumentException)
    { println ("Erro: Valor negativo não possui raiz real") }
}