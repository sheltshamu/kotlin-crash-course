fun main (){
    var name1 = "Shelton"
    var  name2 = "Shelton"
    var name3 = String("Shelton".toCharArray())
//    println(".equals ${name1.equals(name2)}")
//    println("== ${name1 == name2}")

    println(name1 === name2) //using === is for comparing memory location
    println(name2.equals(name3))

}