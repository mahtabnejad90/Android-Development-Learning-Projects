fun main (args: Array<String>) {

/*
    println("Hello World")
    println("Mahtab has started Kotlin development")

    //naming must be exact as variables declared are case sensitive
    //convention; declare variables in lower capital (camel case)
    //classes start in capital letters
    //make sure variable names are specific so that they can reflect their purpose or value
    //double and float are fractional number types; the value for double must start with a decimal value
    //declaring variable types start with a capital letter
    //difference between val and var. Variables are changeable and vals are read only once declared initially. vals are like constants in other languages.
    //declaring string variable - different ways of declaring variables.
    //use lightbulb sign for other suggestions. left side of the line of code
    //when using double quotes or numbers for ints, kotlin automatically detects that value is of string or integer variable.

    //String:
    var ali: String
    var mahtab = "Mahtab Nejad"
    println("My first name is: $mahtab")
    ali = "Ali Bahman Nejad"


    var nejad: String
    nejad = "Bahman Nejad"
    println("my surname is: $nejad")

    var stringNumber = "32"

    //Integers & numbers:

    var mahtabsWeeklySalary = 32
    var mahtabsMonthlySalary = mahtabsWeeklySalary * 4
    println("my weekly salary is: $mahtabsWeeklySalary")
    println("my montly salary is $mahtabsMonthlySalary")
    println()

    val pomegranates = 6
    val oranges = 5
    var fruit = pomegranates + oranges
    println("the total amount of fruit we have is: $fruit")

    println()

    println("A quarter of the pomegranates is: ${pomegranates / 4}")

    println()
    val weeks = 130
    val years: Double = weeks / 52.0
    println("$weeks weeks in years is: $years years")

//string concatenation (ladida term for joining things together) & interpolation
    mahtab = "The penguin"


    println("My name is $mahtab")
    println("this is to print out the dollar sign and a value together: \$mahtab")

    println("Ali's full name is: $ali")

*/

   /* val lives = 0
    var isGameOver = (lives < 1)
    println(isGameOver)

    if (isGameOver) {

        println("Game Over!")

    } else {

        println("you're still alive!")

    }*/


/*println("How old are you: ")

val age = readLine()!!.toInt()
    println("Your age is: $age")
    val message: String
    message = when {
        age < 18 -> "you are under age"
        age == 100 -> "you are eligible"
        else -> "you can vote"
    }*/

/*
message = if (age < 18) {
"you are under age"
} else if (age == 100) {
"you are eligible"
} else {
"you can vote"
}*/
//println(message)


/*    println(mahtab.name)
    println(mahtab.lives)
    println(mahtab.level)
    println(mahtab.score)*/

val louise = Player(name = "Louise", lives = 0, score = 0)


val jon = Player(name = "Jon", lives = 0, score = 0)


val mahtab = Player(name = "Mahtab", lives = 8, score = 0)
    mahtab.show()
val jimmy = Player(name = "Jimmy", lives = 5, score = 1000)
    jimmy.show()

println(mahtab.weapon.name.toUpperCase())
println(mahtab.weapon.damageInflicted)

   val axe = Weapon(name = "Axe", damageInflicted = 12)
    mahtab.weapon = axe
    println(mahtab.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(mahtab.weapon.damageInflicted)

jon.weapon = Weapon("Sword", damageInflicted = 10)
//println(jon.weapon.name)
jon.show()

louise.weapon= jon.weapon
louise.show()
jon.weapon = Weapon(name="Spear", damageInflicted = 14)
//println(jon.weapon.name)
jon.show()


val redPotion = Loot(name = "Red Potion", LootType.POTION, value=7.50)
mahtab.inventory.add(redPotion)


}