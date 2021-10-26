package whoisabel.com.androidbasicsinkotlin.unit2.pathWay1

import java.lang.Math.PI

open class RoundHut(residents: Int, private val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override fun floorArea(): Double {
        return PI * radius * radius
    }

    fun calculateMaxCarpetSize(): Double {
        val diameter = 2 * radius
        return kotlin.math.sqrt(diameter * diameter / 2)
    }
}