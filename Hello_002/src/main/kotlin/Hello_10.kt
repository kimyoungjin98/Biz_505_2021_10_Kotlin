import java.util.*
import kotlin.math.pow

fun main() {
    var scan: Scanner = Scanner(System.`in`)

    println("반지름을 정수값으로 입력하세요 ")
    var strInput = scan.nextLine()
    var radius: Double = 0.0
    try {
        radius = strInput.toDouble()
    } catch (e: NumberFormatException) {
        println("정수값을 입력하세요")
    }
    // 원의 둘레 : 반지름 * 2 * PI
    // 원의 며적 : 반지름 * 반지름 * PI
    // 구의 표면적 : 반지름 * 반지름 * 4 * PI
    // 구의 부피 : 반지름 * 반지름 * 반지름 * PI * (3/4)
    var pi = Math.PI
    if (radius != 0.0) {
        println("반지름 : $radius")
        println("원의 둘레 : ${radius * 2 * pi}")
        println("원의 면적 : ${radius.pow(2) * pi}")
        println("구의 표면적 : ${radius.pow(2) * 4 * pi}")
        println("구의 부피 : ${radius.pow(3) * pi * 3 / 4}")
    }
}