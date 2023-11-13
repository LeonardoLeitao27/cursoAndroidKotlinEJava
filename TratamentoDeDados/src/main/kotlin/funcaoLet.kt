fun main() {
    var str:String? = null
    str = "Leonardo"

    if (str != null){
        println("Caiu no if")
    }

    str?.let {
        println("Caiu na funcao let")
    }
}