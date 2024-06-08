package com.wikosac.core.data.repository

import com.wikosac.core.data.source.local.LocalDataSource
import com.wikosac.core.data.source.remote.RemoteDataSource
import com.wikosac.core.domain.model.Game
import com.wikosac.core.domain.repository.GameRepository
import com.wikosac.core.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GameRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : GameRepository {
    override fun getGamesList(): Flow<Resource<List<Game>>> {
        return remoteDataSource.getGamesList()
    }

    override fun getDetailGame(id: Int): Flow<Resource<Game>> {
        TODO("Not yet implemented")
    }

    override fun searchGame(keyword: String): Flow<Resource<List<Game>>> {
        TODO("Not yet implemented")
    }

    override fun getWishlist(): Flow<Resource<List<Game>>> {
        TODO("Not yet implemented")
    }

    override fun addWishlist(game: Game) {
        TODO("Not yet implemented")
    }

    override fun removeWishlist(id: Int) {
        TODO("Not yet implemented")
    }
}