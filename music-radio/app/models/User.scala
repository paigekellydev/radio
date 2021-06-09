
// Make sure it goes in the models package
package models

import play.api.libs.json.Json

// Create our Post type as a standard case class
case class User(id: Int, username: String)

object User {
  // We're going to be serving this type as JSON, so specify a
  // default Json formatter for our User type here
  implicit val format = Json.format[User]
}