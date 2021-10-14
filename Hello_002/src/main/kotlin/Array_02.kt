fun main() {

    /**
     * java에서 배열은 한번 생성이 되면
     * 배열의 크기를 변경 할수 없다
     *
     * 코틀린에서는 java와 같은 배열 요소가 없다
     * List 형의 특별한 데이터 타입만 존재
     *
     * 불변형 List와 가변형 List가 있다
     * 불변형 List는 한번 크기, 요소가 지정되면
     *      요소를 추가, 삭제할 수 없다
     * 가변형 List는 코드가 실행되는 과정에서
     *      요소를 추가, 삭제할 수 있다
     *
     */
    var lList = listOf(1,2,3,4,5,6)
    var mArray:MutableList<Int> = mutableListOf()
    mArray.add(100)
    mArray.add(200)

    println(mArray)

//    // 실제값으로 요소 제거
//    aArray.remove(200)
//    // index 번쨰 요소 제거
//    aArray.remoeAt(0)
//    println(aArray)

}