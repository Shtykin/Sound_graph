package ru.shtykin.soundgrapher.presentation.screen.splash

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import ru.shtykin.soundgrapher.presentation.state.ScreenState

@Composable
fun SplashScreen(
    uiState: ScreenState
) {
    Text(
        text = "Hello!",
    )
}