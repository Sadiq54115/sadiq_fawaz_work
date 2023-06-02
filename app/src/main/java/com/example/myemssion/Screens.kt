package com.example.myemssion

sealed class Screens(val route: String){

    object MainScreen:Screens("main Screen")
    object FourWheelScreen:Screens("four wheel")
}
