package whoisabel.com.androidbasicsinkotlin.unit2.pathWay1

class RoundTower(
    residents: Int,
    private val floors: Int = 2,
    radius: Double
) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}