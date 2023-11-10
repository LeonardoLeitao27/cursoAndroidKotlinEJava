fun vetorInteiros(){
    var numeros = arrayOf(0,1,2,3,4,5,6)
    for(i in 0..numeros.size-1){
    print(numeros[i])
    }
    print("\n")

}

fun vetorInteiros2(){
    var n = Array(10,{i->i})

    for(i in n){
        print("${n[i]}")
    }
    print("\n")
}




fun main() {
    vetorInteiros2()
}