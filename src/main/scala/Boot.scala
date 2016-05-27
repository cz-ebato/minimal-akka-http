import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import akka.event.Logging
import service.HealthRoutes
import akka.actor.Props

object Boot extends App with HealthRoutes {
  implicit lazy val system = ActorSystem("sampleSystem")
  implicit lazy val materializer = ActorMaterializer()
  implicit val ec = system.dispatcher
//  implicit val executionContext = system.dispatcher
  val interface = Conf.interface
  val port = Conf.port
  val logger = Logging(system, getClass)

  logger.info(s"  - Configuration: Start server at $interface $port on ActorSystem(${system.name})")
  Http().bindAndHandle(route, interface, port)

}
