package com.sel2in.kotlinDefaultsJson
//
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@MicronautTest
class ControllerTest(@Client("/") val client: HttpClient) {

    @Test
    fun testVer() {
        val request: HttpRequest<Any> = HttpRequest.GET("/v1/artifact/ver")
        val body: String = client.toBlocking().retrieve(request)
        Assertions.assertNotNull(body)
        Assertions.assertTrue(body.length > 1)
        Assertions.assertTrue(body == "02")
        println("test done")
    }

    @Test
    fun testPublish() {
        val jsonBody = mapOf(
            "product" to "product 4",
            "label2" to ""
        )
        val request: HttpRequest<Any> = HttpRequest.PUT("/v1/artifact/publish", jsonBody)
        val body: String = client.toBlocking().retrieve(request)
        Assertions.assertNotNull(body)
        Assertions.assertTrue(body.length > 1)
        Assertions.assertTrue(body.indexOf("Test json") > -1)
        println("testPublish done")
    }


    @Test
    fun testRoot() {
        val request: HttpRequest<Any> = HttpRequest.GET("/v1/artifact/")
        val body: String = client.toBlocking().retrieve(request)
        Assertions.assertNotNull(body)
        Assertions.assertTrue(body.length > 1)
        Assertions.assertTrue(body.indexOf("0") > -1)
        println("testRoot done")
    }

}

