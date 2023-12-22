open class eletronicos(var marca :String ){
    private fun corrente(ativo:Boolean){

    }

    fun ligar(){
        corrente(true)
    }
    fun desligar(){
        corrente(false)
    }
}

class pc(marca:String):eletronicos(marca){
    fun salvar(){
        
    }
}
fun main() {

}