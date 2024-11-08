class voiture(private var marque: String, private var modele: String, private var annee : Int, private var kilometrage: Int){
    public afficherDetails(){
        print("la marque de la voiture est : ", marque,
         "\n modèle de la voiture :", modele, 
         "\n l'année de la voiture: :", annee, 
         "\n le kilometrage est :", kilometrage)
       
    }

    public conduire(km: Int ){
        kilometrage += km
    }
}