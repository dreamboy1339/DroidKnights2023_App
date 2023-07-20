package com.droidknights.app2023.feature.home.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.droidknights.app2023.feature.home.HomeScreen

fun NavController.navigateHome() {
    navigate(HomeRoute.route)
}

fun NavGraphBuilder.homeNavGraph(
    padding: PaddingValues,
    onContributorClick: () -> Unit,
) {
    composable(route = HomeRoute.route) {
        HomeScreen(padding, onContributorClick)
    }
}

object HomeRoute {
    const val route = "home"
} 