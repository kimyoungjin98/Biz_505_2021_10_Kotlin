import java.util.*

val scan:Scanner = Scanner(System.`in`)

fun main() {
//    print("문자열을 입력")
//    var input:String = scan.nextLine()
//    println("입력한 문자열 : $input ")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력 받고
     * 두 숫자의 4칙연산을 수행하여 console에 표시
     */

    print("문자열1 입력 : ")
    var input1:String = scan.nextLine()
    var num1 = input1.toInt()
    print("문자열2 입력 : ")
    var input2:String = scan.nextLine()
    var num2 = input2.toInt()

    println("$num1 + $num2 : ${num1 + num2}")
    println("$num1 - $num2 : ${num1 - num2}")
    println("$num1 * $num2 : ${num1 * num2}")
    println("$num1 / $num2 : ${num1 / num2}")

}