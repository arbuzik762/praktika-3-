fun convertTemperature() {

    print("Введи температуру: ")
    val temp = readLine()!!.toDouble()
    
    print("Из какой единицы (C/F/K): ")
    val from = readLine()!!.uppercase()
    
    println("\nРезультаты:")
    
    when (from){
        "C" ->{
            val fahrenheit = temp * 9/5 + 32
            val kelvin = temp + 273.15
            println("$temp °C = ${"%.2f".format(fahrenheit)} °F")
            println("$temp °C = ${"%.2f".format(kelvin)} K")
        }
        "F" ->{
            val celsius = (temp - 32) * 5/9
            val kelvin = (temp - 32) * 5/9 + 273.15
            println("$temp °F = ${"%.2f".format(celsius)} °C")
            println("$temp °F = ${"%.2f".format(kelvin)} K")
        }
        "K" ->{
            val celsius = temp - 273.15
            val fahrenheit = (temp - 273.15) * 9/5 + 32
            println("$temp K = ${"%.2f".format(celsius)} °C")
            println("$temp K = ${"%.2f".format(fahrenheit)} °F")
        }
        else -> println("Неизвестная единица измерения!")
    }
}

fun convertLength() {

    print("Введи длину: ")
    val length = readLine()!!.toDouble()
    
    print("Из какой единицы (m/km/cm): ")
    val from = readLine()!!.lowercase()
    
    println("\nРезультаты:")
    
    when (from) {
        "m" -> {
            println("$length м = ${length * 100} см")
            println("$length м = ${length / 1000} км")
        }
        "km" -> {
            println("$length км = ${length * 1000} м")
            println("$length км = ${length * 100000} см")
        }
        "cm" -> {
            println("$length см = ${length / 100} м")
            println("$length см = ${length / 100000} км")
        }
        else -> println("Неизвестная единица измерения!")
    }
}

fun convertWeight() {

    print("Введи вес: ")
    val weight = readLine()!!.toDouble()
    
    print("Из какой единицы (kg/g/lb): ")
    val from = readLine()!!.lowercase()
    
    println("\nРезультаты:")
    
    when (from) {
        "kg" -> {
            println("$weight кг = ${weight * 1000} г")
            println("$weight кг = ${"%.2f".format(weight * 2.20462)} фунтов")
        }
        "g" -> {
            println("$weight г = ${weight / 1000} кг")
            println("$weight г = ${"%.2f".format(weight * 0.00220462)} фунтов")
        }
        "lb" -> {
            println("$weight фунтов = ${"%.2f".format(weight * 0.453592)} кг")
            println("$weight фунтов = ${"%.2f".format(weight * 453.592)} г")
        }
        else -> println("Неизвестная единица измерения!")
    }
}

fun convertTime() {

    print("Введи время: ")
    val time = readLine()!!.toDouble()
    
    print("Из какой единицы (h/min/s): ")
    val from = readLine()!!.lowercase()
    
    println("\nРезультаты:")
    
    when (from) {
        "h" -> {
            println("$time часов = ${time * 60} минут")
            println("$time часов = ${time * 3600} секунд")
            println("$time часов = ${"%.2f".format(time / 24)} дней")
        }
        "min" -> {
            println("$time минут = ${time / 60} часов")
            println("$time минут = ${time * 60} секунд")
        }
        "s" -> {
            println("$time секунд = ${time / 60} минут")
            println("$time секунд = ${time / 3600} часов")
        }
        else -> println("Неизвестная единица измерения!")
    }
}

fun main() {

    println("Выбери тип конвертации:")
    println("1 - Температура")
    println("2 - Длина")
    println("3 - Вес")
    println("4 - Время")
    
    print("Твой выбор: ")
    val choice = readLine()!!.toInt()
    
    when (choice) {
        1 -> convertTemperature()
        2 -> convertLength()
        3 -> convertWeight()
        4 -> convertTime()
        else -> println("Неверный выбор!")
    }
}
