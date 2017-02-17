package traitqq

/**
  * Created by wangfx on 2017/2/16.
  */
class Rocket {

  import Rocket.fuel
  private def cangohomeagain = fuel > 20

}

object Rocket {

  private def fuel = 10

  def chooseStrategy(rocket: Rocket): Unit = {
    if (rocket.cangohomeagain)
      gohome()
    else
      pickastar()
  }
  def gohome() {}

  def pickastar() {}
}
