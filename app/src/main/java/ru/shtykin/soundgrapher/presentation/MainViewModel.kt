package ru.shtykin.soundgrapher.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.shtykin.soundgrapher.domain.usecase.GetVolumeUseCase
import ru.shtykin.soundgrapher.presentation.screen.graph.GraphScreenState
import ru.shtykin.soundgrapher.presentation.screen.settings.SettingsScreenState
import ru.shtykin.soundgrapher.presentation.state.ScreenState
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getVolumeUseCase: GetVolumeUseCase
): ViewModel() {

    private val _uiState = mutableStateOf<ScreenState>(ScreenState.SplashScreen)
    val uiState: State<ScreenState>
        get() = _uiState

    fun openSettingsScreen(){
        _uiState.value = ScreenState.SettingsScreen(
            state = SettingsScreenState.Initital
        )
    }

    fun openGraphScreen(){
        _uiState.value = ScreenState.GraphScreen(
            state = GraphScreenState.Initial
        )
    }



}