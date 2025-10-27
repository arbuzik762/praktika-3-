fun main(){
    
    val dollar = 70.0
    
    println("Кол-во вечно деревянных: ")
    
    val rubles = readln().toDoubleOrNull()
    
    if (rubles != null) {
        val dollars = rubles / dollar
        val formattedDollars = String.format("%.2f", dollars)
        println("$rubles Р = $formattedDollars $")
    }
}
