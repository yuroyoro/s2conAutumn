abstract class Pt
case class CC( s:String ) extends Pt
case class DD( i:Int, s:String ) extends Pt

def test( p:Pt ) = p  match {
   case CC( s ) => println( s )
   case DD( 3, _ ) => println( "match DD" )
}

