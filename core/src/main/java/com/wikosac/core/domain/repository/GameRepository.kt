package com.wikosac.core.domain.repository

import com.wikosac.core.domain.model.Game
import com.wikosac.core.util.Resource
import kotlinx.coroutines.flow.Flow

interface GameRepository {
    fun getGamesList(): Flow<Resource<List<Game>>>
    fun getDetailGame(id: Int): Flow<Resource<Game>>
    fun searchGame(keyword: String): Flow<Resource<List<Game>>>
    fun getWishlist(): Flow<Resource<List<Game>>>
    fun addWishlist(game: Game)
    fun removeWishlist(id: Int)
}