package main.scala

import scala.io.Source
import org.json4s._
import org.json4s.native.JsonMethods._

object Scalix extends App {
  val api_key = "48d02d2803f669be5643367e3307dd43"
  val url = s"https://api.themoviedb.org/3/movie/155/credits?api_key=$api_key"
  val source = Source.fromURL(url)
  val contents = source.mkString
  println(contents)
  val json = parse(contents)
  println(json)

  def findActorId(name: String, surname: String): Option[Int] = {

  }
}
