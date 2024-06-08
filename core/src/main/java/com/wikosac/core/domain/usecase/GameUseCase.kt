package com.wikosac.core.domain.usecase

import com.wikosac.core.domain.model.Game
import com.wikosac.core.domain.repository.GameRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GameUseCaseImpl @Inject constructor(private val gameRepository: GameRepository): GameUseCase {
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

interface GameUseCase {
    fun getGamesList(): Flow<List<Game>>
    fun getDetailGame(id: Int): Flow<Game>
    fun searchGame(keyword: String): Flow<List<Game>>
    fun getWishlist(): Flow<List<Game>>
    fun addWishlist(game: Game)
    fun removeWishlist(id: Int)
}