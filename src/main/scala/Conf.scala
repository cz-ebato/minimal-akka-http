import com.typesafe.config.ConfigFactory

object Conf {
  private lazy val conf = ConfigFactory.load()
  val interface = conf.getString("http.interface")
  val port = conf.getInt("http.port")
//  val myDispatcher = conf.getString("my-dispatcher")
}
