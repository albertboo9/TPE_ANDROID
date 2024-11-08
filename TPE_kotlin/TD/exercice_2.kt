open class Animal(val nom: String, val age: Int) {

}

class Chien(nom: String, age: Int) : Animal(nom, age) {
    fun aboyer() {
        println("$nom aboie !")
    }
}

class Chat(nom: String, age: Int) : Animal(nom, age) {
    fun miauler() {
        println("$nom miaule !")
    }
}

fun main() {
    val monChien = Chien("Médor", 3)
    val monChat = Chat("Félix", 2)

    monChien.aboyer()
    monChat.miauler()
}