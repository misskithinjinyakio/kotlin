fun main() {
    //while loop
    var number=20
    while (number<=25){
        println("number is $number")
        number++}

    var number2=5
    while (number2>=1){
        println("number is $number2")
        number2--}

    //Do while loop
    var count = 100
    do {
        println("number is $count")
        count++
    }
        while (count<= 105)
        //for loop
        for (x in 35..40){
            println("number:$x")}
//break codes
    for (letter in 'a'..'d'){
        println("letter is $letter")}
    for (a in 1..5){
        if (a==3){
            break
        }
        println("number ia $a")
    }
    //continue codes
    for (myletter in 'd'..'h'){
        if (myletter=='f'){
            continue
        }
        println("the letter is $myletter")
    }
}