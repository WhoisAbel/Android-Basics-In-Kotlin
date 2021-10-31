package whoisabel.com.androidbasicsinkotlin.unit2

import whoisabel.com.androidbasicsinkotlin.unit2.restaurant.Noodles
import whoisabel.com.androidbasicsinkotlin.unit2.restaurant.Order
import whoisabel.com.androidbasicsinkotlin.unit2.restaurant.Vegetables

fun main(){

    val order1 = Order(1)
    order1.addItem(Noodles())
    order1.print()

    val order2 = Order(2)
    order2.addItem(Vegetables())
    order2.print()

    val order3 = Order(3)
    order3.addAll(listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery")))
    order3.print()

 /*   val noodles = Noodles()
    val vegetables = Vegetables("Cabbage", "Sprouts", "Onion")
    val vegetables2 = Vegetables()
    println(noodles)
    println(vegetables)
    println(vegetables2)*/

}