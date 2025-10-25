import kotlin.random.Random

fun main() {
    
    val secretNum = Random.nextInt(1, 101)
    var attempt = 0 
    var dogadka = 0 
    
    println("Какое число?")
    
    while (dogadka != secretNum) {
        print("Пусть будет: ")
        
        val input = readlnOrNull()
        dogadka = input?.toIntOrNull() ?: 0 
        
        if (dogadka == 0) {
            println ("Только числа от 1 до 100")
            continue 
        }
        
        attempt++
        
        when{
            dogadka <secretNum->
        println("Больше")
            
            dogadka >secretNum->
    println("Меньше")
            
            else -> println("Угадал!")
        }
    }
    
    println ("Кол-во попыток: $attempt")
}
