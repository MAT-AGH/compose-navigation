package app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen

sealed class MainGraphScreen(
    val route: String,
) {
    //region Companion
    companion object {
        //Main Navigation Graph values
        const val MAIN_GRAPH_ROUTE_KEY = "graph_main"

        const val MAIN_SCREEN_ROUTE_KEY = "screen_main"

        const val AUTHENTICATION_GRAPH_ROUTE_KEY = "graph_auth"

        const val NAVIGATION_BAR_GRAPH_ROUTE_KEY = "graph_navigation_bar"

        const val DETAILS_GRAPH_ROUTE_KEY = "graph_details"
    }
    //endregion Companion

    //region Screen objects
    object Main : MainGraphScreen(route = MAIN_GRAPH_ROUTE_KEY)

    object MainScreen : MainGraphScreen(route = MAIN_SCREEN_ROUTE_KEY)

    object Authentication : MainGraphScreen(route = AUTHENTICATION_GRAPH_ROUTE_KEY)

    object NavigationBar : MainGraphScreen(route = NAVIGATION_BAR_GRAPH_ROUTE_KEY)

    object Details : MainGraphScreen(route = DETAILS_GRAPH_ROUTE_KEY)
    //endregion Screen objects
}

