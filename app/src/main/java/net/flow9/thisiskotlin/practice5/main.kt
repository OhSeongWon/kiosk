package net.flow9.thisiskotlin.practice5

fun main(){
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var num = 0
        for ( i in 1..n){
            num = x * i
            answer = answer.plus(num.toLong())
        }
        return answer
    }
    solution(0,5)
}

