fun main(){
    val gender = "F"

   val g = when(gender){
        "F" -> "Female"
        "M" -> "Male"
        else -> {
            "Unknown gender"
        }
    }
    println(g)
}