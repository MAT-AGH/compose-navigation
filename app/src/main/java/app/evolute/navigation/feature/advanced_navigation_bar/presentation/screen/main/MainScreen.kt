package app.evolute.navigation.feature.advanced_navigation_bar.presentation.screen.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.graph.NavigationBarGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    modifier: Modifier,
) {
    val navController: NavHostController = rememberNavController()
    Scaffold(
        bottomBar = {
            NavigationBarComponent(
                modifier = modifier,
                navController = navController)
        }
    ) {
        NavigationBarGraph(
            modifier = modifier
                .padding(it),
            navController = navController
        )
    }
}

