import kotlin.random.Random

fun main() {
    var rnd:Random = Random(System.currentTimeMillis())
    var num1:Int = rnd.nextInt(100)
    when(num1 % 2){
        0-> println("$num1 짝수")
        1-> println("$num1 홀수")
    }
    var result = when (num1 % 3){
        0-> "3의 배수"
        1-> "글쎄"
        2-> "결과가 2면 뭐임?"
        else-> "알 수 없음"
    }
    println(result)
}