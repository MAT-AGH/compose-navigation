package app.evolute.navigation.feature.basic_navigation.presentation.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen.Companion.AUTH_GRAPH_ROUTE_KEY

@Composable
fun HomeScreen(
    modifier: Modifier,
    navController: NavHostController,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Home",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .clickable {
                    navController.navigate(
                        Screen.Detail.passArguments(
                            id = 1,
                            name = "Matin"
                        )
                    )
                }
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Login/SignUp",
            color = MaterialTheme.colorScheme.inversePrimary,
            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .clickable {
                    navController.navigate(AUTH_GRAPH_ROUTE_KEY)
                }
                .padding(top = 200.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        modifier = Modifier,
        navController = rememberNavController()
    )
}
