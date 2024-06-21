package com.sel2in.kotlinDefaultsJson



import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.annotation.Controller
import org.slf4j.LoggerFactory

//import io.micronaut.validation.Validated
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

@Controller("/artifact")
//@Validated
class Controller {
    private val logger = LoggerFactory.getLogger(Controller::class.java)
    @Put("/publish")
    fun publish(@Body artifactRequest2: ArtifactRequest2) : HttpResponse<ServerInfo>{
        logger.info("publishing artifact $artifactRequest2")
        val t = artifactRequest2.product + " ."
        val t2 = DateTimeFormatter.ISO_INSTANT
            .format(Instant.now().atZone(ZoneId.systemDefault()))
        return HttpResponse.ok(ServerInfo(env = t, appName = "Test json ", time = t2))
    }

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun index() = "002"

    @Get("/ver")
    @Produces(MediaType.TEXT_PLAIN)
    fun ver() = "02"
}