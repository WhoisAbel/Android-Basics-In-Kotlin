package whoisabel.com.androidbasicsinkotlin.unit2.pathWay1

class SquareCabin(residents: Int, private val length: Double) : Dwelling(residents) {
    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 4
    override fun floorArea(): Double {
        return length * length
    }
}