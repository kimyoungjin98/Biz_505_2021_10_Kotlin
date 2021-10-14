import java.lang.NumberFormatException
import java.util.*

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    while(true){
        print("정수값을 입력하세요 : ")
        var strNum = scan.nextLine()
        var intNum = try{
            Integer.valueOf(strNum)
        } catch(e:NumberFormatException){
            println("정수만 입력해야 합니다")
            continue
        }
        if(intNum % 3 == 0){
            println("$intNum 는 3의 배수")
        } else {
            print("$intNum 는 3의 배수가 아님")
        }
    }
}