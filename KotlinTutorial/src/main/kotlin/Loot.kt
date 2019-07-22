//ALL VALUES OF ENUM MUST BE CAPITAL (Kotlin convention)
enum class LootType{
    POTION, RING, ARMOR
}


class Loot(val name: String, val type: LootType, val value: Double) {



}