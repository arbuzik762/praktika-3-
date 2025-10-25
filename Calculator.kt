fun main() {
    print ("Первое число: ")
    val n1String = readln()
    val n1 = n1String.toDoubleOrNull()
    
    print ("Действие (+, -, *, /): ")
    val operator = readln()
    
    print ("Второе число: ")
    val n2String = readln()
    val n2 = n2String.toDoubleOrNull()
    
    if (n1 == null || n2 == null) {
        println("Ошибка")
        return
    }
    
    when (operator) {
        "+" -> {
            val result = n1 + n2
            println("Результат: $result")
        }
        
        "-" -> {
            val result = n1 - n2
            println("Результат: $result")
        }
        
        "*" -> {
            val result = n1 * n2
            println("Результат: $result")
        }
        
        "/" -> {
            val result = n1 / n2
            println("Результат: $n1 / $n2 = $result")
        }
        
        
    }
}
