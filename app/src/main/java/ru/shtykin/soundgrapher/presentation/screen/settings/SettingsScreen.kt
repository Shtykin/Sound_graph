package ru.shtykin.soundgrapher.presentation.screen.settings

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import ru.shtykin.soundgrapher.presentation.state.ScreenState

@Composable
fun SettingsScreen(
    uiState: ScreenState,
    onGraphClick: (() -> Unit)?,
) {
    Button(
        onClick = { onGraphClick?.invoke() }
    ) {
        Text("Ta-dish")
    }
}