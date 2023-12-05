package net.flow9.thisiskotlin.practice5

class Bugers : Menu(){
    var bugers = 0
    private var bugerorder = arrayOf("ShackBurger", "SmokeShack ", "Shroom Burger", "Shack Stack ", "Hamburger")

    override fun menu(){
        println("""1. ShackBurger   | W 8.4 | 비프 패티와 함께 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 10.6 | 베이컨, 체리 페퍼, 비프 패티와 쉑소스가 토핑된 치즈버거
3. Shroom Burger | W 10.0 | 포토벨로 버섯 패티에 양상추, 토마토, 쉑소스를 올린 베지테리안 버거
4. Shack Stack   | W 14.8 | 포토벨로 버섯 패티, 비프 패티와 함께 토마토, 양상추, 쉑소스가 토핑된 치즈버거
5. Hamburger     | W 6.8 | 포테이토 번과 비프 패티를 기본으로 토핑을 취향에 따라 선택할 수 있는 버거
0. 뒤로가기      | 뒤로가기
        """.trimIndent())

        //주문받는 코드(예외처리함)
        while (true){
            try{
                bugers = readln()!!.toInt()
                if(bugers !in 0..5){
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

        //돌아가기를 눌렀을 때 메인으로 돌아가고 주문을 했을 경우 주문내역에 추가하고 주문내역을 보여주는 코드
        if ( bugers == 0){
            return main()
        }
        else{
            orderlist = orderlist.plus(bugerorder[bugers-1])
            println("주문내역")
            println(orderlist.contentToString())
        }

        //주문을 더 받을 것인지 물어보고 더 받으면 메인으로 아니면 전체 주문내역과 가격을 출력
    }
}