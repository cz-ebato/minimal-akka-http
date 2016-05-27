import org.scalatest.{Matchers, WordSpec}
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import com.example.Main

class TestKitExampleSpec extends WordSpec with Matchers with ScalatestRouteTest {

  "The service" should {
    "return a 'succeeded in get method' for GET requests to the path /health " in {
      Get("/health") ~> Main.route ~> check {
        status === StatusCodes.OK
        responseAs[String] shouldEqual "succeeded in get method"
      }
    }
    "return a 'succeeded in post method' for POST requests to the path /health " in {
      Post("/health") ~> Main.route ~> check {
        status === StatusCodes.OK
        responseAs[String] shouldEqual "succeeded in post method"
      }
    }
    "return a 'succeeded in put method' for PUT requests to the path /health " in {
      Put("/health") ~> Main.route ~> check {
        status === StatusCodes.OK
        responseAs[String] shouldEqual "succeeded in put method"
      }
    }
    "return a 'succeeded in patch method' for PATCH requests to the path /health " in {
      Patch("/health") ~> Main.route ~> check {
        status === StatusCodes.OK
        responseAs[String] shouldEqual "succeeded in patch method"
      }
    }
  }
}
