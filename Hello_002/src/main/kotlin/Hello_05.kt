import kotlin.random.Random

fun main() {
    var rnd: Random = Random(System.currentTimeMillis())

    var start1 = rnd.nextInt(100)
    var end1 = rnd.nextInt(100)

    println("start1: $start1, end1: $end1")

    var min1 = if(start1 > end1) end1 else start1
    var max1 = if(start1 > end1) start1 else end1



    var sum = 0
    for(num in min1..max1){
        if(num % 2 == 0){
            sum += num
            println("짝수 $num")
        }

    }
    println("$sum")

    // swap 코드
    if(start1 > end1){
        var temp = start1
        start1 = end1
        end1 = temp
    }


}