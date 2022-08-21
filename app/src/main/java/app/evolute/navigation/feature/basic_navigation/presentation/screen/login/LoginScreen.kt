package app.evolute.navigation.feature.basic_navigation.presentation.screen.login

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
import app.evolute.navigation.feature.basic_navigation.presentation.navigation.screen.Screen.Companion.HOME_GRAPH_ROUTE_KEY

@Composable
fun LoginScreen(
    modifier: Modifier,
    navController: NavHostController,
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            color = MaterialTheme.colorScheme.tertiary,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .clickable {
                    navController.navigate(
                        route = Screen.SignUp.route
                    )
                }
        )
        Text(
            text = "Go Back",
            color = MaterialTheme.colorScheme.tertiary,
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .clickable {
                    navController.navigate(HOME_GRAPH_ROUTE_KEY) {
                        popUpTo(HOME_GRAPH_ROUTE_KEY) {
                            inclusive = true
                        }
                    }
                }
                .padding(top = 150.dp)
        )
        Text(
            text = "Go To Details",
            color = MaterialTheme.colorScheme.tertiary,
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .clickable {
                    navController.popBackStack()
                    navController.navigate(
                        Screen.Detail
                            .passArguments(
                                1,
                                "Matin"
                            )
                    )
                }
                .padding(top = 150.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        modifier = Modifier,
        navController = rememberNavController()
    )
}