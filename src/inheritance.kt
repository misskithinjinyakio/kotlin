//parent class/super class/base class
open class Animal{
    var age=3
    var gender="male"
    fun makesound(){
        println("animal is speaking")
    }
}


//child class/derived class/subclass
class dog:Animal(){
    fun bark(){
        println("woof! woof! woof!")
    }
}

class cat{
    var color = "white"
    var hasFur= true
    fun meow(){
        println("Meaw! Meow!")
    }
}

fun main() {
    var a=Animal()

    var d=dog()
    d.bark()
    println(d.gender)
    var c=cat()



}