fun main() {
    var i=0

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

    while (j<str.length){
        if(str[j] == 'p'){
            break
        }
        print("${str[j]}")
    j++
    }

    for(i in 0..20){
        if(i%2==1){
            continue
        }
        print("${i} ")
    }
}