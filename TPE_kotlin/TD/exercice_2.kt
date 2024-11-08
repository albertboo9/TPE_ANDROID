open class Animal(val nom: String, val age: Int) {
    open fun faireDuBruit() {
        println("L'animal fait du bruit.")
    }
}

class Chien(nom: String, age: Int) : Animal(nom, age) {
    override fun faireDuBruit() {
        println("$nom aboie !")
    }
}

class Chat(nom: String, age: Int) : Animal(nom, age) {
    override fun faireDuBruit() {
        println("$nom miaule !")
    }
}

fun main() {
    val monChien = Chien("Médor", 3)
    val monChat = Chat("Félix", 2)

    monChien.faireDuBruit()
    monChat.faireDuBruit()
}