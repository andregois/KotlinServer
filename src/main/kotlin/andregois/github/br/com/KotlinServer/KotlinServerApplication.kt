package andregois.github.br.com.KotlinServer

import andregois.github.br.com.KotlinServer.model.Recipe
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.File
import java.net.URL

@SpringBootApplication
class KotlinServerApplication

fun main(args: Array<String>) {
    runApplication<KotlinServerApplication>(*args)
}
