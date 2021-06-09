// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.com.example.binders._

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def ping: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/ping")
    }
  
  }


}
