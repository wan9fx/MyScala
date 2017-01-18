package object bobsdelights{
  def showFruit(fruit:Fruit): Unit = {
    import fruit._
    println(name + "s are " + color)
  }
}

package printmenu
import bobsdelights.Fruits
import bobsdelights.showFruit
object PrintMenu {

  def main(args: Array[String]): Unit = {
    for (fruit <- Fruits.menu){
      showFruit(fruit)
    }
  }

}
