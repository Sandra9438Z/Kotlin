fun main() {
   println("Quel est ton prénom ? :")
   var name = readln()
   println("Salutations $name")
}

fun main() {
   println("Entre un nombre :")
   var c = readln().toInt()
   println("Entre un deuxieme nombre:")
   var c2=  readln().toInt()
   println("La somme est $c+$c2 = ${c+c2}")
   println("La difference est $c-$c2 = ${c-c2}")
   println("Le produit est $c*$c2 = ${c*c2}")
   println("Le quotient est $c/$c2 = ${c/c2}")
}

fun main(){
   println("Quel est ton age : ")
   var age = readln().toInt()
   if (age <= 26)
   println("Tarif reduit")
   else
      println("tarif normal")
}

fun main() {
   println("Entre un nombre :")
   var pro = readln().toInt()
   println("Entre un deuxieme nombre")
   var pro1 = readln().toInt()
   if ($pro * $pro1 > 0) or 
   println("Produit positif")
   else
      println("Produit negatif")
   }

}
