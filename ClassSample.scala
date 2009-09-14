
object A{
  class  Foo ( s:String, i:Int )  {
     val p1:String = s
     var p2:Int = i
     private var p3 = 1

     def hoge = s * p3
  }
  object Foo {
    val aaa ="aaa"
    def setP3( foo:Foo, i:Int) = foo.p3 = i
  }
}
