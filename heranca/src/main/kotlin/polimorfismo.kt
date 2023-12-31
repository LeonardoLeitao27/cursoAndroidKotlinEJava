/*
interface dev{
    var salario:Float
    fun bonus():Float
}
class mobile(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class game(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class back(override var salario: Float):dev{
    override fun bonus(): Float {
        return salario*0.7f
    }
} */

/*
//SEM POLIMORFISMO
fun mostrarBonus(m:mobile){
    println(m.bonus())
}
fun mostrarBonus(g:game){
    println(g.bonus())
}
fun mostrarBonus(b:back){
    println(b.bonus())
} */

//COM POLIMORFISMO
fun mostrarBonus(d:dev){
    println(d.bonus())
}

fun main() {
    mostrarBonus(back(1000f))
    mostrarBonus(game(1000f))
    mostrarBonus(mobile(1000f))
}

abstract class dev(var salario:Float){
    abstract fun bonus():Float
}
class mobile(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class game(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.7f
    }
}
class back(salario: Float):dev(salario){
    override fun bonus(): Float {
        return salario*0.7f
    }
}
