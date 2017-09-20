package Feedback

import org.apache.log4j.{Level, Logger}

object config {

    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)

    val rootLogger = Logger.getRootLogger()
    rootLogger.setLevel(Level.ERROR)


}
