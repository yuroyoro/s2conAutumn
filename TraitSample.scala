trait  Bar  {
   val  bs:String = "Bar"
   def  bar( n:Int )  = bs * n
}
trait Baz { def baz( n:Int ) = "Baz" * n }

class Foo extends Bar with Baz

