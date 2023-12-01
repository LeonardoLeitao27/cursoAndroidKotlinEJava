class Silvestre(var nome: String){

    var atk: Int? = null
    constructor(nome:String, atk:Int): this(nome){
        this.atk = atk
    }

    fun AP(){
        println("Meu animal silvetre é: ${nome} e seu ataque é $atk")
    }
}
fun main() {
    val s1 = Silvestre("Aguia")
    val s2 = Silvestre("Serpente", 1000)

    s1.AP()
    s2.AP()
}