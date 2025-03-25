import java.util.Scanner
fun main() {
    var read=Scanner(System.`in`)
    println("Enter the day(number) :")
    var day=read.nextInt()
    var result = when(day){
        1->"Monday"
        2->"Tuesday"
        3->"Wenesday"
        4->"Thursday"
        5->"Friaday"
        6->"Saturday"
        7->"Sunday"
        else->"Invalid day entered"

    }
    println("the day is $result")

}