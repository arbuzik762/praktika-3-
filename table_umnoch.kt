fun main() {
    println("Введите цифру: ")
    val num1 = readLine()?.toIntOrNull()
    
    if (num1 == null){
        println("Ошибка: ")
        return
    }
    
    println("$num1")
    
    for (i in 1..9){
        val result = num1 * i
        println("$num1 * $i = $result")
    }
}
