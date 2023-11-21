import java.lang.IllegalArgumentException
import kotlin.ArithmeticException
import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 1

    try {
        val res = numerador/denominador
        println(res)
    }catch (e: ArithmeticException){
        println("Erro ${e}")
    }

    val numero = -4.0
    try {
        val res2 = sqrt(numero)
        if (numero < 0){
    /* Como existem raiz quadrada de numeros negativos para numeros complexos
    * eu utilizo o if para verificar se o numero é negativo e com o throw
    * eu lanço a exceção do catch*/
            throw IllegalArgumentException()
        }
        println(res2)
    }catch (e: IllegalArgumentException){
        println("Não existe raiz real de numeros negativos")
    }
}