/* A funsão SET atribui um valor*/
/* A função GET retorna um valor*/
/* A função Field evita chamadas infinitas*/
class Planeta2(var nome:String){
    private var id = 1
    var tamanho = 1000
    var fala = "Terra"
        get(){
            println("Acessando get")
            return field
        }
        set(value){
            println("Acessando set")
            field = value
        }
}

class Planeta3{
    var nome : String = ""
        get() {
            println("Meu nome é $field")
            return field
        }
        set(value){
            if(value==""){
                println("Todo planeta tem um nome")
            }else{
                field = value
            }
        }
}
fun main() {
    var p: Planeta2 = Planeta2("Terra")
    println("Imprimindo o tamanho ${p.tamanho}")
   var a: Planeta2 = Planeta2("Marte")
    a.fala
    a.fala = "Novo planeta Marte"
    a.fala = "Novo planeta Marte"
    a.fala


    var p3:Planeta3 = Planeta3()
    p3.nome = ""
    println(p3.nome)
    p3.nome = "Jupiter"
    println(p3.nome)
}