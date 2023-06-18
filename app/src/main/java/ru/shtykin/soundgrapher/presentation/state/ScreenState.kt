package ru.shtykin.soundgrapher.presentation.state

import ru.shtykin.soundgrapher.presentation.screen.graph.GraphScreenState
import ru.shtykin.soundgrapher.presentation.screen.settings.SettingsScreenState

sealed class ScreenState {

    object SplashScreen: ScreenState()

    data class SettingsScreen(
        val state: SettingsScreenState
    ) : ScreenState()

    data class GraphScreen(
        val state: GraphScreenState
    ) : ScreenState()

}