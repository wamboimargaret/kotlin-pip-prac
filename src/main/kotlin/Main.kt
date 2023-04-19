import kotlin.time.times

fun main() {
    println(getArea(6.0,3.0))
    println(convert(20.5))
    fact("Megan",10,"black")
    println(diceroll(1..6))
    println(diceroll(7..15))

    findAve(30,15,5)
    circumferenceArea(7.0)
    even()
  //  calculateFactorial(10)
}
//Write a program that calculates the area of a rectangle.
//The user should be prompted to enter the length and width of the rectangle.
fun getArea(len:Double,wid:Double): Double{
    var area = len * wid
    return area

}
//Write a program that converts temperature from Celsius to Fahrenheit.
//The user should be prompted to enter the temperature in Celsius.
fun convert(temp:Double): Double{
    var change = (temp * 1.8 )+ 32
    return change
}
//Write a program that prompts the user to enter their name, age, and favorite color,
//and then prints out a message including all of that information.
fun fact(name:String, age:Int,color:String){
    println("My name is $name I am $age years old and I love color $color")

}

//Write a program that simulates a dice roll. The user should be prompted to enter the number
//of sides on the dice, and then the program should randomly generate a number between
//1 and the number of sides. The program should then print out the result of the roll.
fun diceroll(sides: IntRange):Int{
    var genRandom = sides.random()
    return genRandom
}
//Write a program that calculates the average of three numbers.
//The user should be prompted to enter the three numbers.
fun findAve(num:Int,num2:Int,num3:Int):Int{
    var ave = (num + num2 + num3)/3
    return ave
}

//Write a program that converts a number from decimal to binary.
//The user should be prompted to enter the decimal number.

//Write a program that calculates the factorial of a number. The user should be prompted to enter the number.
//fun calculateFactorial(num:Int): Long

//Write a program that calculates the area and circumference of a circle.
//The user should be prompted to enter the radius of the circle.
 fun circumferenceArea(radius:Double){
     var area = 3.14 * (radius * radius)
         var circumference = (2 * 3.14) * radius
     println( "The area is $area and the circumference is $circumference"  )
 }

//Write a program that calculates the sum of all even numbers between 1 and 100.
fun even(){
    var sum = 0
    for (i in 1..100){
        if(i%2===0){
            sum+=i
    }

        }
    println(sum)
}
