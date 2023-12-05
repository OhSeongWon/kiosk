package net.flow9.thisiskotlin.practice5

class Chicken : Menu(){
    var chicken = 0

    override fun menu(){
        println("""1. Hot Chicken    | W 9.5 | 치킨 통살과 스파이시 슬로, 핫 스파이시 시즈닝이 토핑된 치킨 버거
2. Chicken Shack  | W 8.0 | 치킨 통살과 양상추, 피클, 허브 마요 소스가 토핑된 치킨 버거
3. Chick'n Bites  | W 5.9 | 한 입에 먹기 좋은 바삭한 치킨 바이트 (6-count)
0. 뒤로가기       | 뒤로가기""")
        while (true){
            try{
                chicken = readLine()!!.toInt()
                if(chicken !in 0..3){
                    println("다시 입력해주세요")
                    continue
                }
                else{
                    break
                }
            }
            catch(e:Exception){
                println("다시 입력하세요")
            }
        }
        if ( chicken == 0){
            return main()
        }
        else{
            println("정상작동")
        }
    }
}