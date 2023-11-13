fun main() {
    var str: String? = null
    str = "Leonardo"
    if (str == null){
        println("Variavel nula")
    }else{
        println(str)
    }

    //Operador elvis
    println(str ?: "nula") //Operador elvis - lembra o  operador ternário
}