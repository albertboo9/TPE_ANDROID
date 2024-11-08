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

