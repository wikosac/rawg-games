package com.wikosac.core.data.repository

import com.wikosac.core.data.source.local.LocalDataSource
import com.wikosac.core.data.source.remote.RemoteDataSource
import com.wikosac.core.domain.model.Game
import com.wikosac.core.domain.repository.GameRepository
import kotlinx.coroutines.flow.Flow

class GameRepositoryImpl(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
): GameRepository {
    override fun getGamesList(): Flow<List<Game>> {
        TODO("Not yet implemented")
    }

    override fun getDetailGame(id: Int): Flow<Game> {
        TODO("Not yet implemented")
    }

    override fun searchGame(keyword: String): Flow<List<Game>> {
        TODO("Not yet implemented")
    }

    override fun getWishlist(): Flow<List<Game>> {
        TODO("Not yet implemented")
    }

    override fun addWishlist(game: Game) {
        TODO("Not yet implemented")
    }

    override fun removeWishlist(id: Int) {
        TODO("Not yet implemented")
    }
}