fun main() {

    var numbers = Array(45, {index->index+1})
    viewList(numbers)

    numbers.shuffle()
    println("=".repeat(50))
    viewList(numbers)

    var lottoNum = numbers.slice(0..5)
    println("=".repeat(50))
    print(lottoNum)

}

fun viewList(numbers:Array<Int>){

    for((index,num) in numbers.withIndex()){
        print("$num, ")
        if((index+1) % 5 == 0) println()
    }

}