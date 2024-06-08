package com.wikosac.rawggames.ui

import androidx.lifecycle.ViewModel
import com.wikosac.core.domain.usecase.GameUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val gameUseCase: GameUseCase): ViewModel() {
}