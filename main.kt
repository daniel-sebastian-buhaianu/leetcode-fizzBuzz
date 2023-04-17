fun main() {
    println(fizzbuzz(15).joinToString())
}

fun fizbuzz(n: Int): List<String> {
    val list = List(n) { i ->
        val result: String
        val index = i + 1
        if (index % 3 == 0 && index % 5 ==0) {
            result = "FizzBuzz"
        } else if (index % 3 == 0) {
            result = "Fizz"
        } else if (index % 5 == 0) {
            result = "Buzz"
        } else {
            result = index.toString()
        }
        result
    }
    return list
}