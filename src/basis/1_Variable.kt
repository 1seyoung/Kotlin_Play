package basis

//코틀린은 변수를 선언할 때 탑레벨에서 선언 가능함
var x = 1


fun main(){
    x +=1
    println(x)

    // val is immutable
    //키워드 변수명 : 타입 = 값
    val a : Int = 1

    //타입 생략 가능, 코틀린 컴파일러 자동 추론
    val b = 1

    //지연 할당 , 변수를 선언하고 그 뒤에 대입, 변수를 선언할 때 초기화 하지 않아도 됨, 타입 명시는 필수
    val c: Int
    c = 1

    println(c)

    //코틀린 변수 타입
    // val => value, immutable : 변경 불가능
    // var => variable, mutable : 변경 가능

    val e : String = "Hello"
    //e = "World" // Error

    var f = 123
    //f = "hi"    // Error : 타입은 고정됨

}
