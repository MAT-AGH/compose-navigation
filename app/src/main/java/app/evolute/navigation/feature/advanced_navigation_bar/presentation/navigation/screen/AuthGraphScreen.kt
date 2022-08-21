package app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen

sealed class AuthGraphScreen(val route: String) {
    //region Companion
    companion object {
        //Main Navigation Graph values
        const val LOGIN_SCREEN_ROUTE_KEY = "screen_login"

        const val SIGNUP_SCREEN_ROUTE_KEY = "screen_signup"

        const val FORGOT_SCREEN_ROUTE_KEY = "screen_forgot"
    }
    //endregion Companion

    //region Screen objects
    object Login : AuthGraphScreen(route = LOGIN_SCREEN_ROUTE_KEY)

    object Signup : AuthGraphScreen(route = SIGNUP_SCREEN_ROUTE_KEY)

    object Forgot : AuthGraphScreen(route = FORGOT_SCREEN_ROUTE_KEY)
    //endregion Screen objects
}

