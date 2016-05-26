package com.example

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes.OK

object Main {
  def main(args: Array[String]): Unit = {

    implicit val system = ActorSystem("sampleSystem")
    implicit val materializer = ActorMaterializer()
    implicit val ec = system.dispatcher

    val route = path("health") {
      get {
        complete(OK)
      }
    }

    Http().bindAndHandle(route, "127.0.0.1", 8080)
  }
}
