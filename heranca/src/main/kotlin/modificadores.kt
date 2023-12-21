//Private, Public e protected
open class eletronico2(marca:String){
    private fun ativarCorrente(){

    }
    fun ligar(){
        println("está ligado")
    }

    fun desligar(){
        println("desligando")
    }
}

class computador2(marca:String):eletronico2(marca){
    fun instalarSoftware(){
        println("Instalando software no computador")
    }

    fun varredura(){
        println("realizando varredura")
    }
}

fun main() {
    var c:computador2 = computador2("dell")
    c.ligar()
    c.varredura()
    c.desligar()
}