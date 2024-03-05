//Exercice 1

class voiture {
    var marque: String = ""
    var modele: String = ""
    var vitesse: Int = 0

    constructor() {
    }

    constructor(marque: String, modele: String, vitesse: Int) {
        this.marque = marque
        this.modele = modele
        this.vitesse = vitesse
    }


    fun accelerer(vitesse: Int): String {
        this.vitesse += vitesse
        return "La vitesse est de $vitesse km/h"
    }
}

fun main() {
    val v1 = voiture("", "", 0)
    val v2 = voiture("Volvo", "V50", 0)
    v1.marque = "Peugeot"
    v1.modele = "308"
    println(v2.modele)
    println(v1.accelerer(60))
    println(v2.accelerer(40))
}
