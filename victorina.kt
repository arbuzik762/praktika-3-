fun main(){
    var x = 0 
    println("Викторина")

    do{
        println("Сколько будет 2 + 2 * 2")
        if (readln() == "6"){
            ++x
        }
        println("Сколько пальцев на руке")
        if (readln() == "5"){
            ++x
        }
        println("Самая высокая точка мира")
        if (readln() == "Эверест"){
            ++x
        }
        println("Количество секунд в часе")
        if (readln() == "60"){
            ++x
        }
        println("Столица России")
        if (readln() == "Москва"){
            ++x
        }
    } while(false)
    
    println("Количество правельных ответов: $x из 5")
}
