//Exercice 1
class Personne {
    var nom: String = ""
    var Poids: Double = 0.0
    var Taille: Double = 0.0

    fun IMC(): Double{
        var imc = Poids/(Taille*Taille)
        return imc
        
    }
}
    fun main(){
     val imc = Personne()
     imc.nom = "Sandra"
     imc.poids = 70.0
     imc.taille = 1.73
        println(imc.nom)
        println(imc.poids)
        println(imc.taille)
        println(imc.IMC())
 }
 
 //Exercice 2
 
