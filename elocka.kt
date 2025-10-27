fun main() {
    print("Высота ёлки: ")
    val n = readln().toInt()
    
    for(i in 1..n){
        repeat(n-i){
            print(" ")
        }
        repeat(2*i-1){
            print("*")        
        }
        println()
    }
    
    println(" ".repeat(n-1)+"|")
}
