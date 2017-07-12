
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/workspace/Practice/play-java-seed/conf/routes
// @DATE:Mon Jul 10 15:24:49 CST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
