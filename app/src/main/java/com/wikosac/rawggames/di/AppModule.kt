package com.wikosac.rawggames.di

import com.wikosac.core.domain.usecase.GameUseCase
import com.wikosac.core.domain.usecase.GameUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindUserUseCase(gameUseCaseImpl: GameUseCaseImpl): GameUseCase

}