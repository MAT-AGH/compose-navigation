package app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen.MainGraphScreen
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.screen.main.MainScreen


@Composable
fun MainNavigationGraph(
    modifier: Modifier,
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        route = MainGraphScreen.Main.route,
        startDestination = MainGraphScreen.Authentication.route
    ) {
        // Authentication Navigation Graph
        authenticationNavigationGraph(
            modifier = modifier,
            navController = navController
        )

        // Main Screen
        composable(
            route = MainGraphScreen.MainScreen.route
        ) {
            MainScreen(
                modifier = modifier
            )
        }
    }
}
