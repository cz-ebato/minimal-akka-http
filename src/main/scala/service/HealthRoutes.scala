package service

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._

trait HealthRoutes {
  val route = path("health") {
    get {
      complete(StatusCodes.OK, "succeeded in get method")
    } ~
      post {
        complete(StatusCodes.OK, "succeeded in post method")
      } ~
      put {
        complete(StatusCodes.OK, "succeeded in put method")
      } ~
      patch {
        complete(StatusCodes.OK, "succeeded in patch method")
      }
  }
}
