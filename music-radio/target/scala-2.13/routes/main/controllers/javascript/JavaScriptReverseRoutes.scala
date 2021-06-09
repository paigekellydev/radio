// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.com.example.binders._

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def ping: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.ping",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/ping"})
        }
      """
    )
  
  }


}
