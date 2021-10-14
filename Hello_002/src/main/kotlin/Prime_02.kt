import java.util.*
import kotlin.random.Random

fun main() {
    var scan:Scanner = Scanner(System.`in`)

    while(true){
        prime()
        println("계속할까요 ? . . .(END:끝내기)")
        var input:String = scan.nextLine()
        if(input.equals("END")) break;
    }
    println("GAME OVER")
}

fun prime() {
    var rnd:Random = Random(System.currentTimeMillis())
    var num1:Int = rnd.nextInt(100)

    println("생성된 난수 : $num1")

    var resultArray = (2 until num1).filter { num1 % it == 0 }
    print(resultArray)
    if(resultArray.isEmpty()) {
        println("$num1 은 소수")
    } else {
        println("$num1 은 소수 아님")
    }
}