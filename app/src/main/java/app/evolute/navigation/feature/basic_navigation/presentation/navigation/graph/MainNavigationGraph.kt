package app.evolute.navigation.feature.basic_navigation.presentation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen.Companion.HOME_GRAPH_ROUTE_KEY
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen.Companion.MAIN_GRAPH_ROUTE_KEY

@Composable
fun SetupMainNavigationGraph(
    modifier: Modifier,
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE_KEY,
        route = MAIN_GRAPH_ROUTE_KEY
    ) {
        // Home Navigation Graph
        homeNavigationGraph(
            modifier = modifier,
            navController = navController
        )

        // Authentication Navigation Graph
        authenticationNavGraph(
            modifier = modifier,
            navController = navController
        )
    }
}