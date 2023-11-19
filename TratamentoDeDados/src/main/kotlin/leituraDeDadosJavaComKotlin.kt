import java.util.Scanner

fun lerInt(){
    //Instanciação da função scanner para a leitura dos dados em java
    val scanner = Scanner(System.`in`)
    println("Digite um número inteiro:")
    //Armazenando a variavel utilizando o scanner mais e declarando o tipo da variavel
    val num = scanner.nextInt()
    println("Você digitou: ${num}")
}

fun lerDouble(){
    val scanner = Scanner(System.`in`)
    println("Digite um número Double:")
    val num = scanner.nextDouble()
    println("Você digitou: ${num}")
}

fun lerString(){
    val scanner = Scanner(System.`in`)
    println("Digite um texto:")
    val num = scanner.next()
    println("Você digitou: ${num+1}")
}

fun lerFloat(){
    val scanner = Scanner(System.`in`)
    println("Digite um numero float:")
    val num = scanner.nextFloat()
    println("Você digitou: ${num}")
}

fun lerBoolean(){
    val scanner = Scanner(System.`in`)
    println("Digite um valor Boleano:")
    val num = scanner.nextBoolean()
    println("Você digitou: ${num}")
    //scanner.close() é utilizado para informar que não existirá mais entrada de dados
    scanner.close()
}

fun main() {
    lerInt()
    lerDouble()
    lerString()
    lerFloat()
    lerBoolean()
}