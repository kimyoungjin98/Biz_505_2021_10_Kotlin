import java.lang.NumberFormatException
import java.util.*

fun main() {
//    print("문자열을 입력")
//    var input:String = scan.nextLine()
//    println("입력한 문자열 : $input ")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력 받고
     * 두 숫자의 4칙연산을 수행하여 console에 표시
     */

//    while(true){
//        print("문자열1 입력 : ")
//        var input1:String = scan.nextLine()
//        var num1 = 0;
//        try {
//            num1 = input1.toInt()
//        }
//        catch (e:NumberFormatException) {
//            println("정수만 입력하세요")
//            continue
//        }
//
//        print("문자열2 입력 : ")
//        var input2:String = scan.nextLine()
//        var num2 = 0;
//        try {
//            num2 = input2.toInt()
//        }
//        catch (e:NumberFormatException){
//            println("정수만 입력하세요")
//            continue
//        }
//
//        println("$num1 + $num2 = ${num1 + num2}")
//        println("$num1 - $num2 = ${num1 - num2}")
//        println("$num1 * $num2 = ${num1 * num2}")
//        println("$num1 / $num2 = ${num1 / num2}")
//
//        return
//    }

        print("문자열1 입력 : ")
        var input1:String = scan.nextLine()
        var num1 = 0;
        try {
            num1 = input1.toInt()
        }
        catch (e:NumberFormatException) {
            println("정수만 입력하세요")
            return
        }

        print("문자열2 입력 : ")
        var input2:String = scan.nextLine()
        var num2 = 0;
        try {
            num2 = input2.toInt()
        }
        catch (e:NumberFormatException){
            println("정수만 입력하세요")
            return
        }

        if(num1 != 0 && num2 != 0){
            println("$num1 + $num2 = ${num1 + num2}")
            println("$num1 - $num2 = ${num1 - num2}")
            println("$num1 * $num2 = ${num1 * num2}")
            println("$num1 / $num2 = ${num1 / num2}")
        } else{
            println("숫자를 잘못입력하여 결과를 출력할 수 없음")
        }



}