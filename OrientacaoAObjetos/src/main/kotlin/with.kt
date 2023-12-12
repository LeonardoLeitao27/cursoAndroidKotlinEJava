class objt{
    fun amanhecer(h:Int){
        if(h<=4 && h>=0){
            println("Está de madrugada")
        }else{
            println("Está de dia")
        }
    }

    fun acordar(n:Int){
        if(n==0){
            println("Está dormindo")
        }else{
            println("Está acordando")
        }
    }
}
fun main() {
    var obj1:objt = objt()

    obj1.amanhecer(1)
    obj1.acordar(0)

    println("---------------------------------------")

    with(obj1){
        amanhecer(1)
        acordar(0)
    }
}