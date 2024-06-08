package com.wikosac.core.domain.model

data class Game(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val rating: Any,
    val platforms: List<String>,
    val genres: List<String>
)
