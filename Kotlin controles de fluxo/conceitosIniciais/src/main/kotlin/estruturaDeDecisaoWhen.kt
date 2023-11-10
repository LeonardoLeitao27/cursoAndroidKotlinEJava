fun main() {
    var cargo:String = "Presidente"

    when(cargo){
        "Presidente" -> println(6000f)
        "Gerente" -> println(4500f)
        "Coordenador" -> println(3000f)
        "Analista" -> println(2400f)
        "Estagiário" -> println(1600f)
        else -> println("Cargo não identificado")
    }


    var imc:Float = 30F

    when(imc){
        10F -> println("Imc está 10 ou abaixo")
        20F -> println("IMC está 20 ou maior que 11")
        30F -> println("Imc está 30 ou maior que 21")
        50F -> println("IMC está 50 ou maior que 31")

        else -> println("IMC ESTÁ ACIMA DO NORMAL")
    }

}