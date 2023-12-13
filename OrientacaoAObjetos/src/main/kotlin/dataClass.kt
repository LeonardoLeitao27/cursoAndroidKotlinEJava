class retangulo(var a:Int, var b:Int){
    /*A DataClass substitui todo o trabalho do override, compare as duas funções*/
    /*Tanto de equals, como toString e Hashcode*/
    override fun equals(other: Any?): Boolean {
        return if(other is retangulo){
            (other.a == this.a && other.b == this.b)
        }else{
            false
        }
    }
}

data class retanguloData(var a:Int, var b:Int){

}
fun main() {
    var ret: retangulo = retangulo(10,20)
    var ret2: retangulo = retangulo(10,20)
    //equals, toString, HashCode
    println(ret.equals(ret2))

    var ret3: retanguloData = retanguloData(10,20)
    var ret4: retanguloData = retanguloData(10,20)
    println(ret3.equals(ret4))

}