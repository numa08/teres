package net.numa08

import org.jsoup._
import java.io.File
import scala.collection.JavaConversions._


object Uecexpress extends App {

	val kyukou = Kyukou.parse("kyukou.html")
	kyukou.foreach{ k : Kyukou => println(s"${k.date}, ${k.subject}")}//1月24日(金), Academic Written English Ⅱ
}

object Kyukou {
	
	def parse(file : String) : List[Kyukou] = {
		Jsoup.parse(new File(file), "UTF-8")
		     .getElementsByTag("TABLE").head
		     .getElementsByTag("TR").tail
		     .map {tr => 
		     	val tds = tr.getElementsByTag("TD")
		     	Kyukou(tds(1).text, tds(3).text)
		     }.toList
	}
}


case class Kyukou(val date : String, val subject : String)