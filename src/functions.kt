fun main() {
    //standard library functions/predefine functions
    var x=Math.sqrt(144.0)
    println("the square root of 144 is $x")
    var y=Math.round(12.45)
    println("the roundoff of 12.45 is $y")
    school()//calling a functions
    stundent("Joseph",21)
    stundent("Ian",19)
    employee("Faith",80000,false)
    employee("Mary",60000,true)
    employee("Mercy",100000,false)


}
//user define functions
fun school(){
    println("eMobilis")

}
//parameter/variable and arguments/value
fun stundent(name:String,age:Int){
    println("$name is $age years old")

}
fun employee(name: String,salary:Int,disability:Boolean,){
    println("$name is earning $salary.Has disability: $disability")
}