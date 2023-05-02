fun main() {
    divideTwoNumbers(27,3)
    introduction("Angeth",20,"AkiraChix")

    println( add(21,34,10,8))

    println(average(8,4,5,6,7))

    usersDetails("Lucy",23,"Kenya")

    personsRecords("Susan",25,"+2567986535","susanamanda@gmail.com",52.6,"Ugandan")



}
fun divideTwoNumbers(num1:Int,num2:Int){
    var dividend=num1/num2
    println(dividend)

}

fun introduction(name:String,age:Int,school:String){
    var message="Hello, my name is $name.I am $age years old. I go to $school"
//    println("Hello, my name is $name.I am $age years old. I go to $school")
    println(message)
}
//1. Create and invoke a function that takes in a users name, age, and nationality and prints out
// “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and,
// I am from Kenya” (2 points)

fun usersDetails(name: String,age: Int,nationality:String){
    println("Hello my name is $name, I am $age years old and, I am from $nationality")

}

//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)

fun add(num3:Int,num4:Int,num5:Int,num6:Int):Int {
    var addition=num3+num4+num5+num6
    return addition
}


//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun average(number:Int,number1:Int,number2:Int,number3:Int,number4:Int):Double{
       var sumAverage=number1+number+number2+number3+number4
        return sumAverage/5.0

}

//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun personsRecords(fullName:String,age: Int,phoneNumber: String,email:String,weight:Double,citizen:String) {
    println(fullName)
    println(age)
    println(phoneNumber)
    println(email)
    println(weight)
    var citizen="Ugandan"
    println(true)
}