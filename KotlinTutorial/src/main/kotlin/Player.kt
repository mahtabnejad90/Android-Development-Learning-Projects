class Player(val name: String, val level: Int = 1, val lives: Int, val score: Int ) {
    //telling kotlin that a name in string must be supplied whenever player objects are created


var weapon: Weapon = Weapon(name= "Fist",damageInflicted=1)



//using var because any of those instances may be interchangeable
fun show(){
    println("""
    name: $name
    lives: $lives
    level: $level
    score: $score
    weapon: ${weapon.name}
    damage: ${weapon.damageInflicted}
"""
    )
}


}