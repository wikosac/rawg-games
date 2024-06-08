package com.wikosac.rawggames.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wikosac.core.domain.model.Game
import com.wikosac.core.domain.usecase.GameUseCase
import com.wikosac.core.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val gameUseCase: GameUseCase): ViewModel() {

    private val _games = MutableStateFlow<Resource<List<Game>>>(Resource.Loading)
    val gamesList: StateFlow<Resource<List<Game>>> get() = _games

    init {
        getGamesList()
    }

    fun getGamesList() {
        viewModelScope.launch {
            gameUseCase.getGamesList().collect {
                _games.value = it
            }
        }
    }

}