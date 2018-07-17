package andregois.github.br.com.KotlinServer.controller

import andregois.github.br.com.KotlinServer.model.Recipe
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.web.bind.annotation.*
import java.net.URL

@RestController
@RequestMapping("recipe")
class RecipeController {

    @GetMapping
    fun list(): List<Recipe> {
        val mapper = jacksonObjectMapper()
        return mapper.readValue<List<Recipe>>(URL("https://raw.githubusercontent.com/andregois/KotlinServer/master/MOCK_DATA.json"))

    }

    @PostMapping
    fun add(@RequestBody recipe: Recipe): Recipe{
        return recipe

    }


}

