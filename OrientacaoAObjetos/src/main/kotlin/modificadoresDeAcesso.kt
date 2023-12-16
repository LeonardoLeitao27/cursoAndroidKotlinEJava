open class Eletronico2(var marca:String){
    fun ligar(){
        println("Está ligado")
    }
    fun desligar(){
        println("Estpa desligado")
    }
    var modelo:String = "Teste de gerança"
}
class Computador2(marca:String):Eletronico(marca){
    fun instalarSoftware(){
        println("Instalando softwares no computador")
    }
    fun Varredura(){
        println("Realizando varrefudura")
    }
}
fun main() {
    var c:Computador2 = Computador2("Dell")
    c.ligar()
    c.desligar()
    c.Varredura()
    c.instalarSoftware()
    println(c.modelo)
}