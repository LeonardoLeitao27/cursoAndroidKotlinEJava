fun main() {
    var i=0

    /* Função While, estrutura de repetição na qual será repetida até a condição entre
    parenteses for falsa ou atingir a função break, que parara a estrutura de repetição. */
    while(i<1000){
        if(i == 20){
            break
        }
        print("${i} ")
        i++
    }


    print("\n")

    var str = "Teste de perfil"

    var j = 0

    /* Estrutura na qual printará, letra por letra a string str.
       Ao atingir a letra p, ele parara a função while*/
    while (j<str.length){

        if(str[j] == 'p'){
            break
        }
        print("${str[j]}")
    j++
    }

    print("\n")

    /* No caso do "continue", ao ser acionado, ele irá ignorar o restante da estrutura
    * e continuará para a proxima iteração.*/
    for(i in 0..20){
        if(i%2==1){
            continue
        }
        print("${i} ")
    }
}