open class Eletronico(var marca:String){
    fun ligar(){
        println("Está ligado")
    }
    fun desligar(){
        println("Estpa desligado")
    }
    var modelo:String = "Teste de gerança"
}
class Computador(marca:String):Eletronico(marca){
    fun instalarSoftware(){
        println("Instalando softwares no computador")
    }
    fun Varredura(){
        println("Realizando varrefudura")
    }
}
fun main() {
    var c:Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.Varredura()
    c.instalarSoftware()
    println(c.modelo)
}