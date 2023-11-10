fun main() {
    for (i in 1..10){
        println(i)
    }
    print("\n")

    for(i in 10 downTo 1){
        println(i)
    }
    print("\n")

    var str:String = "Criação de aplicativos android"

    for (i in str){
        print("${i} ")
    }

    print("\n")

    for (i in 1..20 step 2){
        println(i)
    }
}