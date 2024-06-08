package com.wikosac.core.domain.repository

import com.wikosac.core.domain.model.Game
import kotlinx.coroutines.flow.Flow

interface GameRepository {
    fun getGamesList(): Flow<List<Game>>
    fun getDetailGame(id: Int): Flow<Game>
    fun searchGame(keyword: String): Flow<List<Game>>
    fun getWishlist(): Flow<List<Game>>
    fun addWishlist(game: Game)
    fun removeWishlist(id: Int)
}