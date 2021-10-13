fun main() {

    /**
     * var : 내용을 변경 가능한 변수
     * val : 한 번 저장되면 값을 변경할 수 없는 변수
     */
    val str1 = "Korea"
//    str1 = "Republic of Korea" : 오류 발생

    // listOf() 리스트형 변수를 생성하는 함수
    val 과일들 = listOf("사과", "바나나", "오렌지")
    for(과일 in 과일들){
        println(과일)
    }

    for(index in 과일들.indices){
        println("${index +1} 번째 : ${과일들[index]}")
    }

    if(3 in 1..10){
        println("있어")
    }
    for(num in 1..10){
        if(num == 3){
            println("있어")
        }
    }

    if("사과" in 과일들){
        println("사과 있음")
    }
    if("배" !in 과일들){
        println("배는 없어")
    }

}