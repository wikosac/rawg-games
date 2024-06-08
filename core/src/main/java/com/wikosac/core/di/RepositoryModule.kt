package com.wikosac.core.di

import com.wikosac.core.data.repository.GameRepositoryImpl
import com.wikosac.core.domain.repository.GameRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindUserRepository(gameRepositoryImpl: GameRepositoryImpl): GameRepository
}