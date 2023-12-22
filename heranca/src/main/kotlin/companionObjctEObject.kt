class matematica(){
    //escopo classe e escopo objeto
    companion object M{
        val pi = 3.1415
        fun adc(){

        }
        init {
            println("Iniciando companion")
        }
    }
    object objeto01{
        val euler = 0.03
        val pi = 3.1415
        fun adc(){}
        init {
            println("Iniciando obj1")
        }
    }
    object objeto02{
        val dourado = 1.1
        val pi = 3.1415
        fun adc(){}
        init {
            println("Iniciando obj2")
        }
    }
    object objeto03{
        val t = 8
        val pi = 3.1415
        fun adc(){}
        init {
            println("Iniciando obj3")
        }
    }

}
fun main() {
    //println(matematica.pi)
    var m:matematica = matematica()
    println("Acessando objeto 01 ${matematica.objeto01.euler}")
    println("Acessando objeto 02 ${matematica.objeto02.dourado}")
    println("Acessando objeto 03 ${matematica.objeto03.t}")
    matematica.pi

}