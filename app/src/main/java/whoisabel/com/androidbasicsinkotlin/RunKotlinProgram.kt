package whoisabel.com.androidbasicsinkotlin

import whoisabel.com.androidbasicsinkotlin.unit2.pathWay1.RoundHut
import whoisabel.com.androidbasicsinkotlin.unit2.pathWay1.RoundTower
import whoisabel.com.androidbasicsinkotlin.unit2.pathWay1.SquareCabin

/*
- https://developer.android.com/training/kotlinplayground is an interactive
  code editor on the web where you can practice writing Kotlin programs.
- All Kotlin programs need to have a main() function: fun main() {} .
- Use the println() function to print a line of text.
- Place text you want to print between double quotes. For example "Hello".
- Repeat the println() instruction to print multiple lines of text.
- Errors are marked red in the program. There is an error message in the output
- pane to help you figure out where the error is and what might be causing it.
* */


/*
CodLab 1:
fun main() {
    println("Happy Birthday!")
    println("Jhansi")
    println("You are 25!")
}*/

/*
- Use ${} to surround variables and calculations in the text of print statements.
  For example: ${age} where age is a variable.
- Create a variable using the val keyword and a name. Once set, this value cannot be
  changed. Assign a value to a variable using the equal sign.
  Examples of values are text and numbers.
- A String is text surrounded by quotes, such as "Hello".
- An Int is a whole positive or negative number, such as 0, 23, or -1024.
- You can pass one or more arguments into a function for the function to use,
  for example: fun printCakeBottom(age:Int, layers:Int) {}
- Use a repeat() {} statement to repeat a set of instructions several times.
  For example: repeat (23) { print("%") } or repeat (layers) { print("@@@@@@@@@@") }
- A loop is an instruction to repeat instructions multiple times. A repeat() statement
  is an example of a loop.
- You can nest loops, that is, put loops within loops. For example,
  you can create a repeat() statement within a repeat() statement to print
  a symbol a number of times for a number of rows, like you did for the cake layers.
- Summary of using function arguments: To use arguments with a function,
 you need to do three things:

 Add the argument and type to the function definition: printBorder(border: String)
 Use the argument inside the function: println(border)
 Supply the argument when you call the function: printBorder(border)*/

// CodeLab 2:
fun main() {

    val squareCabin = SquareCabin(6, 50.0)

    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: $capacity")
        println("Material: $buildingMaterial")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }

    val roundHut = RoundHut(3, 10.0)
    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material: $buildingMaterial")
        println("Capacity: $capacity")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }

    val roundTower = RoundTower(4, radius = 15.5)

    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: $buildingMaterial")
        println("Capacity: $capacity")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        println("Carpet size: ${calculateMaxCarpetSize()}")

    }


    /*val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)*/
}

fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}
