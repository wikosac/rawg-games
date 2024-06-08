package com.wikosac.core.util

import com.wikosac.core.data.model.GameItem
import com.wikosac.core.data.model.GenresItem
import com.wikosac.core.data.model.PlatformsItem
import com.wikosac.core.domain.model.Game

object DataMapper {

    fun GameItem.toGame(): Game = Game(
        id,
        name,
        backgroundImage,
        rating,
        platforms.map { it.takeName() },
        genres.map { it.takeName() }
    )

    private fun PlatformsItem.takeName(): String = this.platform.name
    private fun GenresItem.takeName(): String = this.name

}