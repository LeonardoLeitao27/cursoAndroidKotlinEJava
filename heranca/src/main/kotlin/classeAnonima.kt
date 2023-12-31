interface Evento{
    fun ok(){

    }
}
class programa{
    fun salvar(e:Evento){
        println("Abrindo arquivos")
        println("Salvando valores")
        println("Salvando arquivos")
        println("Conexôes realizadas")
        e.ok()
    }
}
/*
class Event():Evento{
    override fun ok() {
        println("Programa está ok")
    }
} */

fun main() {
    val p:programa = programa()
   // val e:Event = Event()
    p.salvar(object  : Evento{
        override fun ok() {
            println("Programa está ok")
        }
    })
}