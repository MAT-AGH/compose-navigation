package app.evolute.navigation.feature.basic_navigation_bar.presentation.screen.main.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import app.evolute.navigation.feature.basic_navigation_bar.presentation.navigation.screen.Screen

@Composable
fun NavigationBarComponent(
    modifier: Modifier,
    navController: NavHostController,
) {
    val screenList = listOf(
        Screen.Profile,
        Screen.Home,
        Screen.Settings
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    androidx.compose.material3.NavigationBar(
        modifier = modifier
    ) {
        screenList.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}