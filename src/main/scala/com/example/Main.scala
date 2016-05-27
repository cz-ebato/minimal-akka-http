package com.example

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.Http

object Main {
  implicit val system = ActorSystem("sampleSystem")
  implicit val materializer = ActorMaterializer()
  implicit val ec = system.dispatcher

  val route = path("health") {
    get {
      complete("succeeded in get method")
    } ~
      post {
        complete("succeeded in post method")
      } ~
      put {
        complete("succeeded in put method")
      } ~
      patch {
        complete("succeeded in patch method")
      }
  }

  def main(args: Array[String]): Unit = {
    Http().bindAndHandle(route, "127.0.0.1", 8080)
  }
}
