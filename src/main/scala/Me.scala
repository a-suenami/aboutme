import java.util.Date

class Me(val firstName: FirstName, val lastName: LastName) {
  def favoriteThings(): Array[String] = {
    return Array("Test-driven development", "Domain-driven design")
  }
}

case class FirstName(val value: String)
case class LastName(val value: String)
