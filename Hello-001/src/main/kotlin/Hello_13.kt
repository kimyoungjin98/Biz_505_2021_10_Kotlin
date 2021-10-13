import kotlin.random.Random

fun main() {
    var num1:Int = Random.nextInt(100)

    for(num in 0..num1){
        print("$num, ")
    }
    println()
    /**
     * 0 ~ 99 까지 범위 중 임의로 생성되어 num1에 저장된 숫자가
     * prime 수 인지 판단하여 출력
     *
     * 2~ 자기자신-1 까지의 범위의 숫자와 나누어 나머지가 한번도 없는 숫자
     */

    var flag:Boolean = true;
    for(num in 2..(num1-1)) {
        if (num1 % num == 0) !flag
    }
    if(flag === false){
        print("$num1 은 소수가 아니다")
    }else {
        print("$num1 은 소수이다")
    }

}