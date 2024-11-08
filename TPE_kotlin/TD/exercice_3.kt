open class Employe(val nom: String, val poste: String, var salaire: Double) {
    fun augmenterSalaire(pourcentage: Double) {
        salaire *= (1 + pourcentage / 100)
    }
}

class Manager(nom: String, poste: String, salaire: Double) : Employe(nom, poste, salaire) {
    private val employesSupervises: MutableList<Employe> = mutableListOf()

    fun ajouterEmploye(employe: Employe) {
        employesSupervises.add(employe)
    }

    fun afficherEmployes() {
        println("Employés supervisés par $nom :")
        employesSupervises.forEach {
            println("- ${it.nom} (${it.poste})")
        }
    }
}

fun main() {
    val employe1 = Employe("Dupont", "Développeur", 3000.0)
    val employe2 = Employe("Durand", "Designer", 2500.0)

    val manager = Manager("Martin", "Chef de projet", 5000.0)
    manager.ajouterEmploye(employe1)
    manager.ajouterEmploye(employe2)

    manager.afficherEmployes()

    employe1.augmenterSalaire(10.0)
    println("Nouveau salaire de ${employe1.nom} : ${employe1.salaire}")
}