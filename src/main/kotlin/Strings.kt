fun main(){
    val name = "Shelton"
    println(name)
    println(name.length)
    println(name.toUpperCase())
    println(name.toLowerCase())
    println(name.isEmpty())
    println(name.isNotEmpty())


    val age = 15
    val msg = "Name: $name, Age: $age"
    println(msg)

    var email = """
        Hello %s
        How
        Are
        You
    """.trimIndent()

    println(email.format("Shelton"))
}