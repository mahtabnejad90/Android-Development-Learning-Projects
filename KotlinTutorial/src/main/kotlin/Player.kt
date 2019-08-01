import java.lang.reflect.Array
import java.util.ArrayList

class Player(val name: String, val level: Int = 1, val lives: Int, val score: Int ) {
    //telling kotlin that a name in string must be supplied whenever player objects are created

var weapon: Weapon = Weapon(name= "Fist",damageInflicted=1)
//using var because any of those instances may be interchangeable

//arraylist:
val inventory = ArrayList<Loot>()


    fun show(){
/*    println("""
    name: $name
    lives: $lives
    level: $level
    score: $score
    weapon: ${weapon.name}
    damage: ${weapon.damageInflicted}
"""
    )*/

if (lives > 0) {
    println("$name is alive")
} else {
    println("$name is dead")
}


}

    override fun toString(): String {
        return """
    name: $name
    lives: $lives
    level: $level
    score: $score
    weapon: ${weapon}
"""

        //damage: ${weapon.damageInflicted}   (inside quotes previously.)
    }

    fun showInventory() {
        println("$name's Inventory")

        //For each loop
        for (item in inventory) {
            println(item)
        }

//        println(inventory.get(0))
        println("=======================================")
    }


}