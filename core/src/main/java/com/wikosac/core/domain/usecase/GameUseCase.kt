package com.wikosac.core.domain.usecase

import com.wikosac.core.domain.model.Game
import com.wikosac.core.domain.repository.GameRepository
import com.wikosac.core.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GameUseCaseImpl @Inject constructor(private val gameRepository: GameRepository): GameUseCase {
    override fun getGamesList(): Flow<Resource<List<Game>>> {
        return gameRepository.getGamesList()
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

interface GameUseCase {
    fun getGamesList(): Flow<Resource<List<Game>>>
    fun getDetailGame(id: Int): Flow<Resource<Game>>
    fun searchGame(keyword: String): Flow<Resource<List<Game>>>
    fun getWishlist(): Flow<Resource<List<Game>>>
    fun addWishlist(game: Game)
    fun removeWishlist(id: Int)
}