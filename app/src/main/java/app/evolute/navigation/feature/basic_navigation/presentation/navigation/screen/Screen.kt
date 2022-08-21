package app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen

sealed class Screen(val route: String) {
    //region Companion
    companion object {
        //Main Navigation Graph values
        const val MAIN_GRAPH_ROUTE_KEY = "graph_main"

        //Home Navigation Graph values
        const val HOME_GRAPH_ROUTE_KEY = "graph_home"

        //Authentication Navigation Graph
        const val AUTH_GRAPH_ROUTE_KEY = "graph_authentication"

        //Home Screen values
        private const val HOME_SCREEN_ROUTE_KEY = "screen_home"

        //Detail Screen Values
        private const val DETAIL_SCREEN_ROUTE_KEY = "screen_detail"
        const val DETAIL_SCREEN_REQUIRED_ARGUMENT_ID = "id"
        const val DETAIL_SCREEN_REQUIRED_ARGUMENT_NAME = "name"

        //Login Screen values
        private const val LOGIN_HOME_SCREEN_ROUTE_KEY = "screen_login"

        //SignUp Screen values
        private const val SIGNUP_SCREEN_ROUTE_KEY = "screen_signup"
    }
    //endregion Companion

    //region Screen objects
    object Home : Screen(route = HOME_SCREEN_ROUTE_KEY)

    object Detail : Screen(
        route = DETAIL_SCREEN_ROUTE_KEY +
                "/{$DETAIL_SCREEN_REQUIRED_ARGUMENT_ID}" +
                "/{$DETAIL_SCREEN_REQUIRED_ARGUMENT_NAME}"
    ) {
        fun passArguments(
            id: Int,
            name: String,
        ): String {
            return DETAIL_SCREEN_ROUTE_KEY +
                    "/$id" +
                    "/$name"
        }
    }

    object Login : Screen(route = LOGIN_HOME_SCREEN_ROUTE_KEY)

    object SignUp : Screen(route = SIGNUP_SCREEN_ROUTE_KEY)
    //endregion Screen objects
}