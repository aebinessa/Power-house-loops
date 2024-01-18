fun main() {
    countUpwards(1,10)
    println("////////////////////////")
    countDownwards(10,1)
    println("////////////////////////")
    println(calculateSum(intArrayOf(1,2,3,4)))
    println("////////////////////////")
    checkEvenOdd(10)
    println("////////////////////////")
    calculateFactorial(5)
    println("////////////////////////")
    enterCorrectnumber(20)





    
}
fun countUpwards(start: Int, end: Int){

    for(i in start..end) println(i)
}

fun countDownwards(end: Int, start: Int){
    var i =end
    while (i >= start) {
        println(i)
        i--
    }

}
fun calculateSum(numbers: IntArray): Int {
    var summation = 0
    for (number in numbers){
        summation = summation + number
    }
    return summation
}

fun checkEvenOdd(number: Int){
    var n = 0
    for(n in 1..number){
        if (n % 2 == 0){
        println("$n is even")}
        else{
            println("$n is odd")
        }

    }
}

fun calculateFactorial(number: Int){
    
    var i = number
    var sum = number
    while (i > 2) {
        (i * (i-1))
        sum = sum * (i-1)
        i--
        println(sum)
    }
}

// last function not working correctly (bonus)
fun enterCorrectnumber(number: Int){
    println("Input:")
    do {
        val y = Integer.valueOf(readLine())
    } while (y != number) // y is visible here!
    println("Correct")
}