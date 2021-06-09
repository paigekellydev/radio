// app/controllers/ApiController.scala

// Make sure it's in the 'controllers' package
package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.libs.json.Json
import repositories.DataRepository
// import _root_.com.me.project.database.Database
// import com.me.project.database.Database

@Singleton
class ApiController @Inject()(cc: ControllerComponents,
                                dataRepository: DataRepository
                            )
    extends AbstractController(cc) {

  // Create a simple 'ping' endpoint for now, so that we
  // can get up and running with a basic implementation
    def ping = Action { implicit request =>
        Ok("Hello, Scala!")
    }

    def getUsers(userId: Int) = Action { implicit request =>
        dataRepository.getUsers(userId) map { user =>
        // If the post was found, return a 200 with the post data as JSON
        Ok(Json.toJson(user))
        } getOrElse NotFound    // otherwise, return Not Found
    }

    // def getUsers =  Action { implicit request =>
    //     val users: dataRepository.getUsers
    //     Ok(Json.toJson(users))

    //}
    
    // def getSongs(songId: Int) = Action { implicit request =>
    //     dataRepository.getSongs(songId) map { song =>
    //     // If the post was found, return a 200 with the post data as JSON
    //     Ok(Json.toJson(song))
    //     } getOrElse NotFound    // otherwise, return Not Found
    // }

}