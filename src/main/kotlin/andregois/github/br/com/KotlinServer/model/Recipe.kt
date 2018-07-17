package andregois.github.br.com.KotlinServer.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Recipe(val id: Int = -1, val name: String = "", val author: String = "", val email: String = "")
