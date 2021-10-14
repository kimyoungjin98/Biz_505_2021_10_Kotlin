import java.lang.NumberFormatException
import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    println("정수를 입력하세요")
    var inputNum:String = scan.nextLine()
    var intNum:Int? = try {
        Integer.parseInt(inputNum.trim())
    }
    catch (e:NumberFormatException){
        println("정수만 입력하세요")
        null
    }

    if(intNum != null && intNum != 0) {
        if (intNum % 3 == 0) println("$intNum 은 3의 배수")
        else println("$intNum 은 3의 배수가 아님")
    }
}