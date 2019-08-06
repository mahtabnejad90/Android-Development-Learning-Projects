fun main(args: Array<String>) {
/*    val tim = Player("Tim")
    tim.show()

    val louise = Player("Louise", 5)
    louise.show()

    val gr8 = Player("gr8", 4, 8)
    val one2watch = Player("Ace",2, 5, 1000)
    gr8.show()
    one2watch.show()
    println(one2watch.weapon.name.toUpperCase())
    println(one2watch.weapon.damageInflicted)

    val axe = Weapon("Axe", 12)
    gr8.weapon = axe
    println(gr8.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(gr8.weapon.damageInflicted)

    tim.weapon = Weapon("Sword", 10)
//    println(tim.weapon.name)
    tim.show()

    louise.weapon = tim.weapon
    louise.show()

    tim.weapon = Weapon("Spear", 14)
//    println(tim.weapon.name)
    tim.show()

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    tim.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    tim.getLoot(chestArmor)
    tim.showInventory()

    tim.getLoot(Loot("Ring of Protection +2", LootType.RING, 40.25))
    tim.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
    tim.showInventory()


    if(tim.dropLoot(redPotion)) {
        tim.showInventory()
    } else {
        println("you don't have a ${redPotion.name}")
    }
    val bluePotion = Loot("Blue Potion", LootType.POTION,6.00)

    if(tim.dropLoot(bluePotion)) {
        tim.showInventory()
    } else {
        println("you don't have ${bluePotion.name} ")
    }


    println(tim.toString())
    for (i in 10 downTo 0 step 2) {
        println("$i squared is ${i * i}")
    }

    for (value in 3..100 step 3) {
        if (value % 5 == 0) {
            println(value)
        }
    }
   if (tim.dropLoot("Invisibility Potion")) {
       tim.showInventory()
   } else {
       println("You don't have an Invisibility Potion")
   }*/

/*val enemy = Enemy("test enemy", 10, 3)
println(enemy)
    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)*/

   /* val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampyre("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)


    */

    for (i in 1 .. 10) {
        val dracula = VampyreKing("Dracula")
        println(dracula)

        while (dracula.lives > 0) {
            if (dracula.dodges()) {
                continue;
            }
            if (dracula.runAway()) {
                println("Dracula ran away")
                break
            } else {
                dracula.takeDamage(80)
            }
        }
        println("--------------------------")
    }

    //for each loop
/*
val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
    //conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))

    conan.showInventory()
*/



}