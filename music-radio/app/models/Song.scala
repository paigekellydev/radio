package models

import play.api.libs.json.Json

// Create our Post type as a standard case class
case class Song(id: Int, songName: String, artist: String, genre: String)

object Song {
  // We're going to be serving this type as JSON, so specify a
  // default Json formatter for our Song type here
  implicit val format = Json.format[Song]
}