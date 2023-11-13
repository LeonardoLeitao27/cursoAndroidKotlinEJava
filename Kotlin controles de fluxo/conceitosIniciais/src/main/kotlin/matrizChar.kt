fun main() {
    val linhas = 3
    val colunas = 3
    val matriz:  Array<Array<Char>> = Array(linhas){Array(colunas) {' '} }
    var c:Char =  'a'


        for (i in 0..linhas-1){
            for (j in  0..colunas-1){
                matriz[i][j] = c
                c++
            }
        }
    println()
    for (i in 0..linhas-1){
        for (j in  0..colunas-1){
            print("${matriz[i][j]} ")
        }
        println()
    }

    println()

    for(linhas in matriz){
        for (valor in linhas){
            print("${valor} ")
        }
        println()
    }

}