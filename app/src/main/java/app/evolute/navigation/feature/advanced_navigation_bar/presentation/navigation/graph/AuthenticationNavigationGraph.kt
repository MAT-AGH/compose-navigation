package app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.graph

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen.AuthGraphScreen
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen.MainGraphScreen
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.screen.basic_content.ContentScreen
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.screen.login.LoginScreen

fun NavGraphBuilder.authenticationNavigationGraph(
    modifier: Modifier,
    navController: NavHostController,
) {
    navigation(
        route = MainGraphScreen.Authentication.route,
        startDestination = AuthGraphScreen.Login.route
    ) {
        //Login Screen
        composable(
            route = AuthGraphScreen.Login.route
        ) {
            LoginScreen(
                modifier = modifier,
                onClick = {
                    navController.popBackStack()
                    navController.navigate(
                        MainGraphScreen.MainScreen.route
                    )
                },
                onSignUpClick = {
                    navController.navigate(
                        AuthGraphScreen.Signup.route
                    )
                },
                onForgotClick = {
                    navController.navigate(
                        AuthGraphScreen.Forgot.route
                    )
                }
            )
        }

        //Signup Screen
        composable(route = AuthGraphScreen.Signup.route) {
            ContentScreen(
                modifier = modifier,
                name = AuthGraphScreen.Signup.route
            ) {}
        }

        //Forgot Screen
        composable(route = AuthGraphScreen.Forgot.route) {
            ContentScreen(
                modifier = modifier,
                name = AuthGraphScreen.Forgot.route
            ) {}
        }
    }
}