package app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen.MainGraphScreen
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen.NavigationBarGraphScreen
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.screen.basic_content.ContentScreen

@Composable
fun NavigationBarGraph(
    modifier: Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        route = MainGraphScreen.NavigationBar.route,
        startDestination = NavigationBarGraphScreen.Home.route
    ) {
        // Home Screen
        composable(
            route = NavigationBarGraphScreen.Home.route
        ) {
            ContentScreen(
                modifier = modifier,
                name = "Hello",
                onClick = {
                    navController.navigate(
                        MainGraphScreen.Details.route
                    )
                }
            )
        }

        // Profile Screen
        composable(
            route = NavigationBarGraphScreen.Profile.route
        ) {
            ContentScreen(
                modifier = modifier,
                name = NavigationBarGraphScreen.Profile.title,
                onClick = { }
            )
        }

        // Settings Screen
        composable(
            route = NavigationBarGraphScreen.Settings.route
        ) {
            ContentScreen(
                modifier = modifier,
                name = NavigationBarGraphScreen.Settings.title,
                onClick = { }
            )
        }

        // Details Graph
        detailsNavigationGraph(
            modifier = modifier,
            navController = navController
        )
    }
}
