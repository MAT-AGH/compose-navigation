package app.evolute.navigation.feature.basic_navigation_bar.presentation.navigation.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    //region Companion
    companion object {
        //Home Screen values
        private const val HOME_SCREEN_ROUTE_KEY = "home"
        private const val HOME_SCREEN_TITLE = "Home"

        //Profile Screen values
        private const val Profile_SCREEN_ROUTE_KEY = "profile"
        private const val Profile_SCREEN_TITLE = "Profile"

        //Settings Screen values
        private const val SETTINGS_SCREEN_ROUTE_KEY = "settings"
        private const val SETTINGS_SCREEN_TITLE = "Settings"
    }
    //endregion Companion

    //region Screen objects
    object Home : Screen(
        route = HOME_SCREEN_ROUTE_KEY,
        title = HOME_SCREEN_TITLE,
        icon = Icons.Default.Home
    )

    object Profile : Screen(
        route = Profile_SCREEN_ROUTE_KEY,
        title = Profile_SCREEN_TITLE,
        icon = Icons.Default.Person
    )

    object Settings : Screen(
        route = SETTINGS_SCREEN_ROUTE_KEY,
        title = SETTINGS_SCREEN_TITLE,
        icon = Icons.Default.Settings
    )
    //endregion screen objects
}