package com.example.travelapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.travelapp.ui.theme.Destination.ActivityScreen
import com.example.travelapp.ui.theme.Home.HomeScreen
import com.example.travelapp.ui.theme.Register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String = ROUTE_HOME) {
    NavHost(navController=navController, modifier = modifier, startDestination = startDestination){
        composable(ROUTE_HOME)
        { HomeScreen(navController) }
        composable(ROUTE_ACTIVITY)
        { ActivityScreen(navController)}
        composable(ROUTE_REGISTER)
        { RegisterScreen(navController)}

    }
}






















