package whoisabel.com.androidbasicsinkotlin.unit2.restaurant

class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        return if (toppings.isEmpty())
            "Vegetables Chef 's Choice"
        else
            name + " " + toppings.joinToString()
    }
}