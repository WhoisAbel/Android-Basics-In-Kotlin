package whoisabel.com.androidbasicsinkotlin.unit1.pathWay4

class Dice(val numSide:Int) {
    fun roll(): Int {
        return (1..numSide).random()
    }
}