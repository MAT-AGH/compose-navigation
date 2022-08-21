package app.evolute.navigation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import app.evolute.navigation.feature.advanced_navigation_bar.presentation.navigation.graph.MainNavigationGraph
import app.evolute.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    //region Variables
    lateinit var navController: NavHostController
    //endregion

    //region Override Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                navController = rememberNavController()

                // For basic navigation practices
//                SetupMainNavigationGraph(
//                    modifier = Modifier,
//                    navController = navController
//                )

                // For basic navigation bar practices
//                 MainScreen()

                // For advanced navigation bar practices
                MainNavigationGraph(
                    modifier = Modifier,
                    navController = navController
                )
            }
        }
    }
    //endregion
}