import org.scalatest._

class MySpec extends FlatSpec with Matchers {
  "My name" should "be Akira SUENAMI." in {
    val me = new Me(
      FirstName("Akira"),
      LastName("SUENAMI")
    )
    me.fullName.toString should be ("Akira SUENAMI")
  }

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
