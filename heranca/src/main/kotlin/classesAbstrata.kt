abstract class mamifero(var nome:String){
    //A classe abstrata serve comente para ser herdade, não pode ser instanciada
    abstract fun habitat()
    abstract fun acorda()
    abstract fun fala()
    abstract fun alimentacao()
    fun tempo(){
    println("Tempo de vida do mamifero")
    }
}
class cachorro(nome:String):mamifero(nome){
    override fun acorda() {
        println("Cachorro está acordado")
    }

    override fun alimentacao() {
        println("Cachorro come ração")
    }

    override fun fala() {
        println("au au")
    }

    override fun habitat() {
        println("Cachorro está no seu habitat")
    }
}
fun main() {
    var d:cachorro = cachorro("cachorro")
    d.tempo()
    d.acorda()
    d.fala()
    d.alimentacao()
    d.habitat()
}