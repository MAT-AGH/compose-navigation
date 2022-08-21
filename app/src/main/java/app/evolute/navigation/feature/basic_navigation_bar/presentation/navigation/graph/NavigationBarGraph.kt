package app.evolute.navigation.feature.basic_navigation_bar.presentation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import app.evolute.navigation.feature.basic_navigation_bar.presentation.navigation.screen.Screen
import app.evolute.navigation.feature.basic_navigation_bar.presentation.screen.home.HomeScreen
import app.evolute.navigation.feature.basic_navigation_bar.presentation.screen.profile.ProfileScreen
import app.evolute.navigation.feature.basic_navigation_bar.presentation.screen.settings.SettingsScreen

@Composable
fun SetupNavigationBarGraph(
    modifier: Modifier,
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        //Home Screen Destination
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(
                modifier = modifier
            )
        }

        //Profile Screen Destination
        composable(
            route = Screen.Profile.route
        ) {
            ProfileScreen(
                modifier = modifier
            )
        }

        //Settings Screen Destination
        composable(
            route = Screen.Settings.route
        ) {
            SettingsScreen(
                modifier = modifier
            )
        }
    }
}