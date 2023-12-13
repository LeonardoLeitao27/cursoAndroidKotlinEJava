open class eletronico(marca:String){
    fun ligar(){
    println("está ligado")
    }

    fun desligar(){
    println("desligando")
    }
}

class computador(marca:String):eletronico(marca){
    fun instalarSoftware(){
    println("Instalando software no computador")
    }

    fun varredura(){
        println("realizando varredura")
    }
}

fun main() {
    var c:computador = computador("dell")
    c.ligar()
    c.varredura()
    c.desligar()
}