package app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen

sealed class DetailsGraphScreen(
    val route: String,
) {
    //region Companion
    companion object {
        const val INFORMATION_SCREEN_ROUTE_KEY = "graph_main"

        const val OVER_VIEW_SCREEN_ROUTE_KEY = "graph_auth"
    }
    //endregion Companion

    //region Screen objects
    object Information : DetailsGraphScreen(
        route = INFORMATION_SCREEN_ROUTE_KEY
    )

    object OverView : DetailsGraphScreen(
        route = OVER_VIEW_SCREEN_ROUTE_KEY
    )
    //endregion Screen objects
}