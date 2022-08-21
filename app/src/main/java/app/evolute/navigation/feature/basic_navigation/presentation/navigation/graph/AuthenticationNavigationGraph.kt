package app.evolute.navigation.feature.basic_navigation.presentation.navigation.graph

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen
import app.evolute.navigation.feature.basic_navigation.presentation.screen.login.LoginScreen
import app.evolute.navigation.feature.basic_navigation.presentation.screen.signUp.SignUpScreen

fun NavGraphBuilder.authenticationNavGraph(
    modifier: Modifier,
    navController: NavHostController,
) {
    navigation(
        startDestination = Screen.Login.route,
        route = Screen.AUTH_GRAPH_ROUTE_KEY
    ) {
        // Login Screen Destination
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(
                modifier = modifier,
                navController = navController
            )
        }

        // SignUp Screen Destination
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(
                modifier = modifier,
                navController = navController
            )
        }
    }
}