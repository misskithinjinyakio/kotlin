fun main() {

    var dog1=Dog("Billy","Chihuahua","brown")
    println(dog1.name)
    var dog2=Dog("Mike","Kienyeji","black")
    println(dog2.breed)
    var dog3=Dog("Joseph","German Shepherd","brown")
    println(dog3.color)
    var dog4=Dog("Ian","Siberian Husky","White")


}

class Dog(var name:String,var breed:String,var color:String){


}