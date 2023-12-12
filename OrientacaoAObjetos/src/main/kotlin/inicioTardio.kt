class robo{
    lateinit var nome:String
    fun ligar(){
        nome = "Iniciando o robo"
    }

    fun inicioTardio(){
        if(!this::nome.isInitialized){
            nome = "Inicializando tardiamente..."
            println(nome)
        }
    }
}
fun main() {
    var bot:robo = robo()

    //println(bot.ligar())
    bot.inicioTardio()
    println(bot.nome)
}