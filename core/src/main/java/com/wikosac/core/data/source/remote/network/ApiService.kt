package com.wikosac.core.data.source.remote.network

import com.wikosac.core.data.model.GameResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("games")
    suspend fun getGamesList(
        @Query("key") key: String
    ): GameResponse

}