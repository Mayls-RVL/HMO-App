package com.example.hmo_app.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hmo_app.screens.Dashboard
import com.example.hmo_app.screens.ForgotPassPage
import com.example.hmo_app.screens.LoginPage

@Composable
fun NavPath(navController: NavHostController = rememberNavController()){
    NavHost(navController = navController, startDestination = "login"){
        composable(
            route = "login",
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -it },
                    animationSpec = tween(400)
                ) + fadeOut(animationSpec = tween(400))
            }
        ){
            // Insert Screen Here
            LoginPage(
                onLogin = {
                    navController.navigate("main") {
                        popUpTo("login") { inclusive = true }
                    }
                },
                onForgotPassword = {
                    navController.navigate("forgotpass"){
                        popUpTo(route = "login") {inclusive = true}
                    }
                }
            )
        }

        composable(
            route= "main",
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it },
                    animationSpec = tween(400)
                ) + fadeIn(animationSpec = tween(400))
            }
        ) { Dashboard() }

        composable(
            route= "forgotpass",
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it },
                    animationSpec = tween(400)
                ) + fadeIn(animationSpec = tween(400))
            }
        ) { ForgotPassPage() }
    }
}