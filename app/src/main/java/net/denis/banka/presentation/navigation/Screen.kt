package net.denis.banka.presentation.navigation

sealed class Screen(val route: String) {

    object MainScreen : Screen("MainScreen")

}