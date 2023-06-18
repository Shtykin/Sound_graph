package ru.shtykin.soundgrapher.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
    startScreenRoute: String,
    navHostController: NavHostController,
    splashScreenContent: @Composable () -> Unit,
    settingsScreenContent: @Composable () -> Unit,
    graphScreenContent: @Composable () -> Unit,
) {
    NavHost(
        navController = navHostController,
        startDestination = startScreenRoute
    ) {
        composable(Screen.Splash.route) {
            splashScreenContent()
        }
        composable(Screen.Settings.route) {
            settingsScreenContent()
        }
        composable(Screen.Graph.route) {
            graphScreenContent()
        }
    }

}