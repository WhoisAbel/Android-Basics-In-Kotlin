package whoisabel.com.androidbasicsinkotlin.unit2.restaurant

class Order(private val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item){
        itemList.add(newItem)
    }

    fun addAll(newItems : List<Item>){
        itemList.addAll(newItems)
    }

    fun print (){
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}\n")
    }

}