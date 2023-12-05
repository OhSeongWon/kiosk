package net.flow9.thisiskotlin.practice5

fun main(){
    var menu = Menu()
    var bugers = Bugers()
    var chicken = Chicken()
    var custard = Custard()
    var concretes = Concretes()
    var drinks = Drinks()


    menu.menu()
    var list = menu.A
    if( list == 1){
        bugers.menu()
    }
    else if( list == 2){
        chicken.menu()
    }
    else if( list == 3){
        custard.menu()
    }
    else if( list == 4){
        concretes.menu()
    }
    else if( list == 5){
        drinks.menu()
    }
    else{
        println("프로그램을 종료합니다")
    }
}



