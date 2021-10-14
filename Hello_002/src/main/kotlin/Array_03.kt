fun main() {

    // key와 value를 쌍으로 갖는 데이터 타입
   val map1 = mapOf("name" to "홍길동", "tel" to "010-111", "addr" to "서울시")

   for( (key, value) in map1){
       println("key : $key , value : $value")
   }

    //  가변형 map
    var map2 = mutableMapOf("name" to "이몽룡", "tel" to "010", "addr" to "남원시")
    map2["tel"] = "010-1111-1111"
    

}