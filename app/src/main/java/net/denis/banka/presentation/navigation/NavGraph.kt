package net.denis.banka.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.denis.banka.presentation.screen.main_screen.MainScreen
import net.denis.banka.presentation.screen.main_screen.MainViewModel


@Composable
fun NavGraph(
    navController: NavHostController,
    vm: MainViewModel,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.MainScreen.route
    ) {

        composable(
            route = Screen.MainScreen.route
        ) {
            MainScreen(vm = vm)
        }
    }
}