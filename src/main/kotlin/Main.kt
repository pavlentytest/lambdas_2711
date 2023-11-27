// https://shorturl.at/kqszO

fun main2() {
    val rr = { println("test") }
    rr()
    val rr2 : () -> Unit = { println("test") }
    val rr3 = { message: String -> println(message) }
    rr3("Test")
    val sum = {x :Int, y: Int -> println(x+y)}
    sum(1,2)
    sum(3,4)

    val sum2 = {x: Int, y: Int ->
        val result = 100*(x+y)
        result
    }

    val sum3 = {x: Int, y: Int -> val result = 100*(x+y);result}

    val f = fun(x: Int, y: Int) : Int {
        if(x>0) {
            return 100
        } else
            return x*x+y*y
    }
    doSmth(3,4, {a: Int, b: Int -> a + b})
    doSmth(3,4) { a: Int, b: Int -> a + b }
    doSmth(5,6, f)

    val test2 = fun(x: Int, y: Int) = x*y
    test2(10,20)

    example(10,12, fun(x: Int, y: Int) = println("$x $y"))
    example2(10,5,fun(x: Int, y: Int) = Math.pow(x.toDouble(),y.toDouble()))

    val result = bigFun(1)
    println(result(4,5))
}
fun bigFun(k: Int) : (Int,Int) -> Int {
    when(k) {
        1 -> return {x: Int, y: Int -> 20+30*(x+y)} // lambda
        2 -> return fun(x: Int, y: Int) = 2*x+3*y // anonym
        else -> return fun(x: Int, y:Int) = 100  // anonym
    }
}
fun example(a: Int, b: Int, test: (Int, Int)-> Unit) {

}
fun example2(a: Int, b: Int, test: (Int, Int)-> Double) {
    println(test(a,b))
}

fun doSmth(x: Int, y: Int, op: (Int,Int)-> Int) {
    println(op(x,y))
}
// ссылка на вызов функции

fun isPositive(x: Int) = x > 0
fun isPositive(s: String) = s == "Kotlin" || s == "kotlin"

class Person(val name: String) {
    fun getSmth() : String = name
}
fun main() {
    val numbers = listOf(-10,-5,0,5,10)
    numbers.filter { x->x>0 }

    numbers.map { x->println(x) }
    numbers.map(::println)

    numbers.filter(::isPositive)
    val strings = listOf("kotlin","sdfasdf","sdfasdfasdf")
    strings.filter(::isPositive)

    val persons = listOf(Person("Ivan"),Person("Olga"))
    persons.map(Person::getSmth)

    val maxim = Person("Maxim")
    val maximfun : () -> String = maxim::getSmth
}













