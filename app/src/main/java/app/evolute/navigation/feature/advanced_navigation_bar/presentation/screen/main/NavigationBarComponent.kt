package app.evolute.navigation.feature.advanced_navigation_bar.presentation.screen.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.screen.NavigationBarGraphScreen

@Composable
fun NavigationBarComponent(
    modifier: Modifier,
    navController: NavHostController,
) {
    val screens = listOf(
        NavigationBarGraphScreen.Home,
        NavigationBarGraphScreen.Profile,
        NavigationBarGraphScreen.Settings
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val navigationBarDestination = screens.any {
        it.route == currentDestination?.route
    }

    if (navigationBarDestination) {
        androidx.compose.material3.NavigationBar {
            screens.forEach { screens ->
                AddItem(
                    modifier,
                    screen = screens,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNavigationBarComponent() {
    NavigationBarComponent(
        modifier = Modifier,
        navController = rememberNavController()
    )
}