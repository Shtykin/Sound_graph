package ru.shtykin.soundgrapher.presentation.screen.graph

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.shtykin.soundgrapher.presentation.state.ScreenState

@Composable
fun GraphScreen(
    uiState: ScreenState,
    onStartRecordClick: (() -> Unit)?,
    onStopRecordClick: (() -> Unit)?,
) {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = { onStartRecordClick?.invoke() }
        ) {
            Text(text = "Start Record")
        }
        Button(
            onClick = { onStopRecordClick?.invoke() }
        ) {
            Text(text = "Stop Record")
        }
        
    }
}