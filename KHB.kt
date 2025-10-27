fun main() {

    do{
        val options = listOf("1", "2", "3")

        val computerChoice = options.random()
    
        println("Выберите: Камень(1), Ножницы(2), Бумага(3)")
    
        val userChoice = readlnOrNull()?.trim()?.lowercase()


        println("Вы: $userChoice")
        println("Компьютер: $computerChoice")
    
        when {
            userChoice == computerChoice -> {
                println("Ничья")
            }
        
            (userChoice == "камень" && computerChoice == "ножницы") ||
            (userChoice == "ножницы" && computerChoice == "бумага") ||
            (userChoice == "бумага" && computerChoice == "камень") -> {
                println("Победа")
            }
        
            else -> {
                println("Проигрыш")
            }
       
        }
        println("Снова y/n? ")
        var x = readln()
        if(x == "n")
        break
    }
    while(true)
}
