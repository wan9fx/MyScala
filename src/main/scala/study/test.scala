package study

/**
  * Created by wangfx on 2017/1/15.
  */
object test {
  def main(args: Array[String]): Unit = {
    val somenumbers = List(-11, -10, -5, 0, 5, 10);
    somenumbers.foreach((x: Int) => println(x))
    somenumbers.filter(x => x > 0)
    println("===============")

    def sum = (_:Int) + (_ : Int) + (_: Int)
    var b = sum ( 1, _ :Int, 3)
    println(b(2))

    println("===============")
    var c = sum (_:Int, 2, _:Int)
    println(c(1,3))
    println("===============")


    var more = 1
    val addmore = (x:Int) => x + more
    more = 9999
    println(addmore(100))

    println("===============")

    def makeincreaser(more:Int) = (x:Int) => x + more

    val inc1 = makeincreaser(1)
    val inc9999 = makeincreaser(9999)
    println(inc1(10))
    println(inc9999(10))
    println("===============")

    def echo ( args: String *) =
      for (arg <- args)
        println(arg)
    echo("one")
    echo("hello", "world")
    println("===============")

    def speed(distance: Float, time:Float) : Float = distance / time
    println(speed(100, 10))
    println(speed(time = 10, distance = 100))
    println(speed(distance=100, time = 10))
    println("===============")

    def printtime(out:java.io.PrintStream = Console.out, divisor:Int = 1) =
      out.println("time = " + System.currentTimeMillis() / divisor)
    printtime();
    printtime(divisor=1000)
    println("===============")



  }

}
