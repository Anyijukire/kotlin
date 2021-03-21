import java.util.*
fun main() {
strings()
    grammar()
    numbers()
    var names= arrayOf("Janet","Bless","Peruth")
    println(Arrays.toString(names))
}
fun strings(){
var strings=arrayOf("one","two","three","four")
    println(Arrays.toString(strings))
}
fun grammar(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { cities->
        println(cities.capitalize())
    }
}
fun numbers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbers[1]+numbers[4]
    println(sum)
    var index=numbers.indexOf(158)
    println(index)
    numbers.forEach { num->
        var sortedArray=numbers.sortedArray()
        println(Arrays.toString(sortedArray))
    }
}
fun names(name1:String, name2:String, name3:String):Array<String>{
val names=arrayOf(name1, name2, name3)
return names

}

