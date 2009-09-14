
import scala.xml._
import scala.io.Source

object S2ConHashTag extends Application{
    val url = "http://search.twitter.com/search.atom?q=sc2009autumn"
    val source = Source.fromURL( url )
    val xml = XML.loadString( source.getLines.mkString )
    for( entry <- xml \\ "entry" ;
         c = entry \\ "content" text ;
         user = entry \\ "author" \\ "name" text ){
     val cxml = XML.loadString("<c>" + c + "</c>" )
     println(user + ":" + cxml.child.text)
    }
}
