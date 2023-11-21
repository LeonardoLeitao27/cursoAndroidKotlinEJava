import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun lerArquivo(){
    var arquivo = File("C:\\Users\\leoce\\OneDrive\\Área de Trabalho\\codes\\cursoAndroidKotlinEJava\\TratamentoDeDados\\src\\main\\kotlin\\passoAPasso.txt")

    try {
        Scanner(arquivo).use { l ->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }

    }catch (e: FileNotFoundException){
        println("Falha ao ler o arquivo")
        //mostra o qual erro ocorreu
        e.printStackTrace()
    }
}
fun main() {
    lerArquivo()
}