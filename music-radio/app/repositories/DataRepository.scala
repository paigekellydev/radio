// app/repositories/DataRepository.scala

package repositories

import javax.inject.Singleton
import models.{User, Song}

@Singleton
class DataRepository {

  // Specify a couple of posts for our API to serve up
  private val users = Seq(
    User(1, "Paige Kelly"),
    User(2, "Mike Butler")
  )

  // Specify some comments for our API to serve up
  private val songs = Seq(
    Song(1, "Ordinary Galaxy", "Tonotopic", "Ambient"),
    Song(2, "When the Time is Right", "LoFi FreQ", "Ambient"),
    Song(3, "REV4", "Mike Estlick", "House")
  )

  /*
   * Returns a blog post that matches the specified id, or None if no
   * post was found (collectFirst returns None if the function is undefined for the
   * given post id)
   */
  def getUsers(userId: Int): Option[User] = users.collectFirst {
    case user if user.id == userId => user
  }

//   def getUsers(songId: Int): Option[User] = songs.collectFirst {
//     case song if song.id == songId => song
//   }


  /*
   * Returns the comments for a blog post
   * If no comments exist for the specified post id, an empty sequence is returned
   * by virtue of the fact that we're using 'collect'
   */
//   def getSongs(songId: Int): Seq[Song] = songs.collect {
//     case song if song.id == songId => song
//   }
}