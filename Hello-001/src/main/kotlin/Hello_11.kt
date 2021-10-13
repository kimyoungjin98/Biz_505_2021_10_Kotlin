import java.lang.NumberFormatException
import java.util.*

/**
 * 숫자를 다루는 코드에서
 * 어떤 값이 0이 아닌 경우에만 처리하는 코드가 있고
 * 0인 경우에도 처리해야 하는 코드가 있다
 *      이때는 변수에 담긴 값이 null인가를 검사하여
 *      코드를 실행할지 말지를 결정해야 한다
 *      이때는 변수에 null을 허용해야 한다
 *      변수:타입? = null 처럼 null로 초기화 된 변수를 선언한다
 */
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

        // num1을 Int형으로 선언하고 null을 제한적으로 허용
        var num1:Int? = null;
        try {
            num1 = input1.toInt()
        }
        catch (e:NumberFormatException) {
            println("정수만 입력하세요")
        }

        print("문자열2 입력 : ")
        var input2:String = scan.nextLine()
        var num2:Int? = null;
        try {
            num2 = input2.toInt()
        }
        catch (e:NumberFormatException){
            println("정수만 입력하세요")
        }

        if(num1 != null && num2 != null){
            println("$num1 + $num2 = ${num1 + num2}")
            println("$num1 - $num2 = ${num1 - num2}")
            println("$num1 * $num2 = ${num1 * num2}")
            println("$num1 / $num2 = ${num1 / num2}")
        } else{
            println("숫자를 잘못입력하여 결과를 출력할 수 없음")
        }



}