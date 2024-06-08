package com.wikosac.core.data.source.remote

import com.wikosac.core.data.source.remote.network.ApiService
import com.wikosac.core.domain.model.Game
import com.wikosac.core.util.DataMapper.toGame
import com.wikosac.core.util.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSource @Inject constructor(private val apiService: ApiService) {

    fun getGamesList(): Flow<Resource<List<Game>>> = flow {
        emit(Resource.Loading)
        try {
            val list = apiService.getGamesList().results
            emit(Resource.Success(list.map { it.toGame() }))
        } catch (e: Exception) {
            emit(Resource.Error(e.message.toString()))
        }
    }.flowOn(Dispatchers.IO)

}