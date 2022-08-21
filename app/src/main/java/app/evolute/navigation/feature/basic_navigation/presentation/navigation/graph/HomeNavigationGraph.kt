package app.evolute.navigation.feature.basic_navigation.presentation.navigation.graph

import androidx.compose.ui.Modifier
import androidx.navigation.*
import androidx.navigation.compose.composable
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen.Companion.DETAIL_SCREEN_REQUIRED_ARGUMENT_ID
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen.Companion.DETAIL_SCREEN_REQUIRED_ARGUMENT_NAME
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen.Companion.HOME_GRAPH_ROUTE_KEY
import app.evolute.navigation.feature.basic_navigation.presentation.screen.detail.DetailScreen
import app.evolute.navigation.feature.basic_navigation.presentation.screen.home.HomeScreen

fun NavGraphBuilder.homeNavigationGraph(
    modifier: Modifier,
    navController: NavHostController,
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE_KEY
    ) {
        // Home Screen Destination
        composable(
            route = Screen.Home.route,
        ) {
            HomeScreen(
                modifier = modifier,
                navController = navController
            )
        }

        // Detail Screen Destination
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(
                    DETAIL_SCREEN_REQUIRED_ARGUMENT_ID
                ) {
                    type = NavType.IntType
                },
                navArgument(
                    DETAIL_SCREEN_REQUIRED_ARGUMENT_NAME
                ) {
                    type = NavType.StringType
                }
            )
        ) {
            DetailScreen(
                modifier = modifier,
                navController = navController
            )
        }
    }
}