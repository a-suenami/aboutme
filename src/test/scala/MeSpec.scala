import org.scalatest._

class MySpec extends FlatSpec with Matchers {
  "I" should "like Test-driven development." in {
    val me = new Me(
      FirstName("Akira"),
      LastName("SUENAMI")
    )
    me.favoriteThings should contain ("Test-driven development")
  }

  "I" should "like Domain-driven design." in {
    val me = new Me(
      FirstName("Akira"),
      LastName("SUENAMI")
    )
    me.favoriteThings should contain ("Domain-driven design")
  }
}
