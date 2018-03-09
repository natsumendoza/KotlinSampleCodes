package BasicSyntaxWalkThrough

/**
 * A reference must be explicitly marked as nullable to be able hold a null.
 * See http://kotlinlang.org/docs/reference/null-safety.html#null-safety
 */

// Return null if str does not hold a number
fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't")
    }
    return null
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("No Number supplied!")
    } else {
        val x = parseInt(args[0])

    }
}