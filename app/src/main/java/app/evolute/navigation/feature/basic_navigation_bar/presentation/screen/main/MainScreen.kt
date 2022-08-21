package app.evolute.navigation.feature.basic_navigation_bar.presentation.screen.main


import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import app.evolute.navigation.feature.basic_navigation_bar.presentation.navigation.graph.SetupNavigationBarGraph
import app.evolute.navigation.feature.basic_navigation_bar.presentation.screen.main.components.NavigationBarComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    modifier: Modifier,
) {
    val navController = rememberNavController()

    Scaffold(
        modifier = modifier,
        bottomBar = {
            NavigationBarComponent(
                modifier = Modifier
                    .height(70.dp),
                navController = navController
            )
        }
    ) {
        SetupNavigationBarGraph(
            modifier = modifier
                .padding(it),
            navController = navController
        )
    }
}



