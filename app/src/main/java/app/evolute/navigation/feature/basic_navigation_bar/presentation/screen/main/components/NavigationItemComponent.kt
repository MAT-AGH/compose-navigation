package app.evolute.navigation.feature.basic_navigation_bar.presentation.screen.main.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import app.evolute.navigation.feature.basic_navigation_bar.presentation.navigation.screen.Screen

@Composable
fun RowScope.AddItem(
    screen: Screen,
    currentDestination: NavDestination?,
    navController: NavHostController?,
) {
    NavigationBarItem(
        label = {
            Text(
                text = screen.title,
                fontSize = 8.sp
            )
        },
        icon = {
            Icon(
                modifier = Modifier
                    .height(20.dp)
                    .aspectRatio(1f / 1f),
                imageVector = screen.icon,
                contentDescription = "Navigation Icon"
            )
        },
        colors = NavigationBarItemDefaults.colors(),
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            navController?.navigate(
                screen.route
            ) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}