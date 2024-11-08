class Voiture(val marque: String, val modele: String, val annee: Int, var kilometrage: Int) {

    fun afficherDetails() {
        println("Marque: $marque \n Modèle: $modele \n Année: $annee \n Kilométrage: $kilometrage km")
    }

    fun conduire(km: Int) {
        if (km > 0) {
            kilometrage += km
            println("La voiture a parcouru $km km supplémentaires.")
        } else {
            println("La distance parcourue doit être positive.")
        }
    }
}