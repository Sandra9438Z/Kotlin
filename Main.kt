//Exercice 1.1
val planetes = arrayOf("mercure", "Venus", "terre", "Mars", "Jupiter", "saturne",
    "Uranus", "Neptune")

fun premier(arr : Array<String>){
    println(arr[0])
    println(arr.first())
    planetes[2] = "La Terre"

}

fun dernier(liste : Array<String>){
    println(liste.last())
    println(liste[liste.size-1])
}

fun commencePar(liste : Array<String>)  {
    println(planetes.filter { it.uppercase().startsWith('M') })

}

fun maj(liste: Array<String>){
    println(liste.map{it.capitalize()})
}

//Exercice 2.3

fun calcule() {
    val entiers = mutableListOf<Int>()
    for(i in 1..10){
        entiers.add( (1..100).random())
    }
    println(entiers)
}

fun main(){
    println(premier(planetes))
    println(dernier(planetes))
    println(planetes.get(2))
    commencePar(planetes)
    println(maj(planetes))
}

