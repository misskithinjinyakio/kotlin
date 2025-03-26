fun main() {
    var doctor1=person()
    println(doctor1.name)
    doctor1.speak()
}
class person{
    var name="Jane"
    var age=40
    var depertment="department1"
    fun speak(){
        println("Doctor is speaking")
    }
}