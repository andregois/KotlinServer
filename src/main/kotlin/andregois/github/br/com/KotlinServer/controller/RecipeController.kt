package andregois.github.br.com.KotlinServer.controller

import andregois.github.br.com.KotlinServer.model.Recipe
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("recipe")
class RecipeController {

    @GetMapping
    fun list(): List<Recipe> {
        return listOf(Recipe("re", "qwe"),
                Recipe("er", "se"))
    }

    @PostMapping
    fun add(@RequestBody recipe: Recipe): Recipe{
        return recipe

    }


}

