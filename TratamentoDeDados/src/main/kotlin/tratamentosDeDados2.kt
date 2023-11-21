import java.lang.NullPointerException
import kotlin.IllegalArgumentException
import kotlin.math.sqrt

fun main() {
    try {
        var s: String? = null
        //s = "Felipe"
        println("${s!!.length}")

        var a = 10/0
        println("${a}")

        var b = -9.0
        var c:Double = sqrt(b)
            if (b<0){
                throw IllegalArgumentException()
            }

        var x = 1
            if (x==1){
                throw Exception()
            }

    }catch (e: NullPointerException){
        println("A variavel está vazia")
    }catch (e: ArithmeticException){
        println("Não existe divisão por zero")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz de numero negativo, sendo exclusivo para o conjunto dos números complexos")
    }catch (e: java.lang.Exception){
        println("Exceção geral")
        println(e.message)
    }finally {
        //O finally será executado independente do que houver no try catch
        println("Finalinando o bloco de tratamento de dados")
    }
}