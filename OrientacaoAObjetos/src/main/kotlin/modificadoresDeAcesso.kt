//private, public e protected
private class F(){
    //estará disponivel somente no arquivo()
    var teste = "classe F"
}
open class Eletronico2(var marca:String){
    private fun ativarCorrente(){

    }
    protected fun relogio(){
        //está disponivel para a classe que recebeu a herança
        println("Função relogio")
    }
    fun ligar(){
        println("Está ligado")
    }
    fun desligar(){
        println("Estpa desligado")
    }
    var modelo:String = "Teste de gerança"
    private var F:String = "Teste"
}
class Computador2(marca:String):Eletronico2(marca){
    fun instalarSoftware(){
        println("Instalando softwares no computador")
        relogio()
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
    //c.f()
    //c.ativarCorrente()
    var t:F = F()
    println(t.teste)


}