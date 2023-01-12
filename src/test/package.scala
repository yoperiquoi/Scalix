trait Config(val api_key: String)

object Test extends App, Config("78...6c") :
  ...
  val url = "...?api_key=$api_key?language=en-US..."
