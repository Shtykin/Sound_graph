package ru.shtykin.soundgrapher.navigation

sealed class Screen(
    val route: String
) {
    object Splash: Screen(ROUTE_SPLASH)
    object Settings: Screen(ROUTE_SETTINGS)
    object Graph: Screen(ROUTE_SETTINGS)

    private companion object {
        const val ROUTE_SPLASH = "splash"
        const val ROUTE_SETTINGS = "settings"
        const val ROUTE_GRAPH = "graph"
    }
}