package ru.shtykin.soundgrapher.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.shtykin.soundgrapher.navigation.AppNavGraph
import ru.shtykin.soundgrapher.navigation.Screen
import ru.shtykin.soundgrapher.presentation.screen.graph.GraphScreen
import ru.shtykin.soundgrapher.presentation.screen.settings.SettingsScreen
import ru.shtykin.soundgrapher.presentation.screen.splash.SplashScreen
import ru.shtykin.soundgrapher.presentation.ui.theme.SoundGrapherTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navHostController = rememberNavController()
            val scope = rememberCoroutineScope()
            val uiState by viewModel.uiState
            val startScreenRoute = Screen.Splash.route
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                AppNavGraph(
                    startScreenRoute = startScreenRoute,
                    navHostController = navHostController,
                    splashScreenContent = {
                        Log.e("DEBUG", "splash")
                        SplashScreen(
                            uiState = uiState,
                            finishLoading = {
                                navHostController.navigate(Screen.Settings.route)
                                viewModel.openSettingsScreen()
                            }
                        )
                    },
                    settingsScreenContent = {
                        Log.e("DEBUG", "settings")
                        SettingsScreen(
                            uiState = uiState,
                            onGraphClick = {
                                navHostController.navigate(Screen.Graph.route)
                                viewModel.openGraphScreen()
                            }
                        )
                    },
                    graphScreenContent = {
                        Log.e("DEBUG", "settings")
                        GraphScreen(
                            uiState = uiState
                        )

                    }
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SoundGrapherTheme {
        Greeting("Android")
    }
}