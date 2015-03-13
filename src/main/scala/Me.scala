import java.util.Date

class Me(val firstName: FirstName, val lastName: LastName) {
  def fullName: FullName = {
    return FullName(firstName, lastName)
  }

  def favoriteThings: Array[String] = {
    return Array("Test-driven development", "Domain-driven design")
  }
}

case class FirstName(val value: String) {
  override def toString: String = {
    return value
  }
}

case class LastName(val value: String) {
  override def toString: String = {
    return value
  }
}

case class FullName(val firstName: FirstName, val lastName: LastName) {
  override def toString: String = {
    return firstName.toString + " " + lastName.toString
  }
}
