fun main(args:Array<String>) {
    var num1 = 30
    var num2 = 30.0

    // num2변수에 담긴 값을 num1변수에 할당(복사하여 저장)한다

    // num2의 값을 toInt를 사용하여 정수형으로 변환하고 그 값을 num1에 대입하라
    // 실수형 변수 num2에 담긴 값을 강제로 정수형으로 변환(toInt())하여
    // 정수형 변수 num1에 저장하라

    // 실수형 변수를 정수형변수로 강제형변환
    num1 = num2.toInt() // integer.valueOf(num2), Integer.parseInt(num2)

    // 문자열형 숫자
    var str = "12345"
    // 문자열형 숫자를 정수형 숫자로 변환하여 정수형 변수에 담기기
    num1 = Integer.parseInt(str)

    // 숫자형을 문자열형으로 형변환
    str="$num1"
    str = num1.toString()
}