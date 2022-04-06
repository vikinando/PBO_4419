//Kotlin if Expression
fun main(args: Array<String>) {

    val number = -10

    if (number > 0) {
        print("Positive number")
    } else {
        print("Negative number")
    }
}

//Kotlin when Expression
fun main(args: Array<String>) {

    val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
}

//Kotlin while Loop
fun main(args: Array<String>) {

    var i = 1

    while (i <= 5) {
        println("Line $i")
        ++i
    }
}

//Kotlin for Loop
fun main(args: Array<String>) {

    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
}

//Kotlin break Expression
fun main(args: Array<String>) {

    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
}

//Kotlin continue Expression
fun main(args: Array<String>) {

    for (i in 1..5) {
        println("$i Always printed.")
        if (i > 1 && i < 5) {
            continue
        }
        println("$i Not always printed.")
    }
}
