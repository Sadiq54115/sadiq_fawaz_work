package com.example.myemssion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myemssion.ui.theme.uip.FourWheelPge
import com.example.myemssion.ui.theme.uip.MainPage

@Composable
fun NavigationSetup(){
    val navController = rememberNavController()
   // navController=NavHostController

    NavHost(navController = navController, startDestination = Screens.MainScreen.route, ){
        composable(Screens.MainScreen.route){
            MainPage(navController)
        }
        composable(Screens.FourWheelScreen.route){
            FourWheelPge(navController)
        }

    }
}