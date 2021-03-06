package study

/**
  * Created by wangfx on 2017/1/15.
  */
class Rational (n:Int, d:Int) extends Ordered[Rational]{
  require(d!=0)
  private val g = gcd (n.abs, d.abs)
  val number = n/g
  val denom = d/g

  override def toString = number + "/" + denom




  def * (that:Rational) =
    new Rational( number * that.number, denom * that.denom)

  def this(n:Int) = this(n, 1)

  private def gcd(a:Int, b:Int) : Int =
    if (b == 0)
      a
  else
      gcd(b, a % b)

  override def compare(that: Rational) =
    (this.number * that.denom) - (that.number * that.denom)


}
