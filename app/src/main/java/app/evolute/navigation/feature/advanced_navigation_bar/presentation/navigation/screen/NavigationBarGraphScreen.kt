package app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationBarGraphScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    //region Companion
    companion object {
        //Main Navigation Graph values
        const val HOME_SCREEN_ROUTE_KEY = "screen_home"
        const val HOME_SCREEN_ROUTE_TITLE = "Home"

        const val PROFILE_SCREEN_ROUTE_KEY = "screen_profile"
        const val PROFILE_SCREEN_ROUTE_TITLE = "Profile"

        const val SETTINGS_SCREEN_ROUTE_KEY = "screen_settings"
        const val SETTINGS_SCREEN_ROUTE_TITLE = "Settings"
    }
    //endregion Companion

    //region Screen objects
    object Home : NavigationBarGraphScreen(
        route = HOME_SCREEN_ROUTE_KEY,
        title = HOME_SCREEN_ROUTE_TITLE,
        icon = Icons.Default.Home
    )

    object Profile : NavigationBarGraphScreen(
        route = PROFILE_SCREEN_ROUTE_KEY,
        title = PROFILE_SCREEN_ROUTE_TITLE,
        icon = Icons.Default.Person
    )

    object Settings : NavigationBarGraphScreen(
        route = SETTINGS_SCREEN_ROUTE_KEY,
        title = SETTINGS_SCREEN_ROUTE_TITLE,
        icon = Icons.Default.Settings
    )
    //endregion Screen objects
}

