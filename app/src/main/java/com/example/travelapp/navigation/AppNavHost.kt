package com.example.travelapp.navigation

import ViewProductsScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.travelapp.ui.theme.Destination.ActivityScreen
import com.example.travelapp.ui.theme.Home.HomeScreen
import com.example.travelapp.ui.theme.products.AddProductsScreen
import com.example.travelapp.ui.theme.products.UpdateProductsScreen

import com.example.travelapp.ui.theme.Register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String = ROUTE_HOME) {
    NavHost(navController=navController, modifier = modifier, startDestination = startDestination) {
        composable(ROUTE_HOME)
        { HomeScreen(navController) }
        composable(ROUTE_ACTIVITY)
        { ActivityScreen(navController) }
        composable(ROUTE_REGISTER)
        { RegisterScreen(navController) }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT) {
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT + "/{id}") { passedData ->
            UpdateProductsScreen(navController, passedData.arguments?.getString("id")!!)

        }
    }
}






















