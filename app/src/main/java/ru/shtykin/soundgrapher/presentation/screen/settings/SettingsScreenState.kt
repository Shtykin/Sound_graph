package ru.shtykin.soundgrapher.presentation.screen.settings

sealed class SettingsScreenState {
    object Initital: SettingsScreenState()

    data class Settings(
        val frequency: Long
    ): SettingsScreenState()
}