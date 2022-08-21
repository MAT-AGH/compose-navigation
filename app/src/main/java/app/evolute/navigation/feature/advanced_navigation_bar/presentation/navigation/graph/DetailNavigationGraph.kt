package app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.graph

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen.DetailsGraphScreen
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen.MainGraphScreen
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.screen.basic_content.ContentScreen

fun NavGraphBuilder.detailsNavigationGraph(
    modifier: Modifier,
    navController: NavHostController,
) {
    navigation(
        route = MainGraphScreen.Details.route,
        startDestination = DetailsGraphScreen.Information.route
    ) {
        // Information Screen
        composable(
            route = DetailsGraphScreen.Information.route
        ) {
            ContentScreen(
                modifier = modifier,
                name = DetailsGraphScreen.Information.route
            ) {
                navController.navigate(
                    DetailsGraphScreen.OverView.route
                )
            }
        }

        // Over View screen
        composable(route = DetailsGraphScreen.OverView.route) {
            ContentScreen(
                modifier = modifier,
                name = DetailsGraphScreen.OverView.route
            ) {
                navController.popBackStack(
                    route = DetailsGraphScreen.Information.route,
                    inclusive = false
                )
            }
        }
    }
}