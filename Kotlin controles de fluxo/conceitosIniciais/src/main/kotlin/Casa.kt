//Criação de funções utilizando kotlin
fun casa(){
    print("Entrando na casa...\n")
    quarto()
}
fun quarto(){
    print("Passando pelo quarto...\n")
    guardaRoupa()
}

fun guardaRoupa(){
    print("Passando pelo guarda roupa\n")
    sapato()
}
fun sapato(){
    print("Escolhendo o sapoto\n")
    cadarco()
}
fun cadarco(){
    print("Escolhendo a cor do cardaco")
}
fun main() {
    casa()
}