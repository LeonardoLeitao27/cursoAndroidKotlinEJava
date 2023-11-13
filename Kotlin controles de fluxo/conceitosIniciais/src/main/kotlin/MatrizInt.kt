fun main() {
    val linhas = 3
    val colunas = 3
        val matriz: Array<Array<Int>> = Array(linhas) {Array(colunas) {0} }

    var digito = -1

        for(i in 0..linhas-1){
            for (j in 0..colunas-1){
                print("${matriz[i][j]} ")
            }
            println()
        }

        for(i in 0..linhas-1){
            for (j in 0..colunas-1){
                matriz[i][j] = digito++
            }
        }


        for (i in 0..linhas-1){
            for (j in 0.. colunas-1){
                print("${matriz[i][j]} ")
            }
            println()

        }


        for(linhas in matriz){
            for (valor in linhas){
                print("${valor} ")
            }
            println()
        }
}