interface Selvagem {
    fun atacar() {
        println("O animal está prestes a atacar")
    }
}
interface quatroPatas{
    fun locomocao(){
        println("O animal está se locomovento")
    }
}
abstract class mamifero2(var nome:String):Selvagem, quatroPatas{
    //A classe abstrata serve comente para ser herdade, não pode ser instanciada
    //Uma classe não pode herdar atributos de mais de uma classe, por isso existem
    //as interfaces, que podem ser herdadas mais de uma vez
    abstract fun habitat()
    abstract fun acorda()
    abstract fun fala()
    abstract fun alimentacao()
    fun tempo(){
        println("Tempo de vida do mamifero")
    }
}
class cachorro2(nome:String):mamifero2(nome){
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

    override fun atacar() {
        println("O cachorro está atacando")
    }

}
fun main() {
    var d:cachorro2 = cachorro2("cachorro")
    d.tempo()
    d.acorda()
    d.fala()
    d.alimentacao()
    d.habitat()
    d.atacar()
    d.locomocao()
}