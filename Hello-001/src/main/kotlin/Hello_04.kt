fun main() {

//    for(i = 0 ; i < 10 ; i ++) {}
    for(num in 0..9){
        print("$num, ")
    }

    var sum = 0
    for(num in 1..10){
        sum += num
    }
    println("1~10 까지의 덧셈 : ${sum}")

    for(num in 0 until 10){
        print(num)
    }

    //for (int i = 10 ; i >= 0; i--){}
    for(num in 10 downTo 1){
        print("$num, ")
    }


    for(num in 0..10 step 2){
        print("$num, ")
    }
}