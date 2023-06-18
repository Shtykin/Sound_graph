package ru.shtykin.soundgrapher.presentation.screen.splash

import android.annotation.SuppressLint
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ru.shtykin.soundgrapher.presentation.state.ScreenState

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(
    uiState: ScreenState,
    finishLoading: (() -> Unit)?,
) {
    val scope = rememberCoroutineScope()
    scope.launch {
        delay(2000)
        finishLoading?.invoke()
    }
    Text(
        text = "Splash!",
    )
}