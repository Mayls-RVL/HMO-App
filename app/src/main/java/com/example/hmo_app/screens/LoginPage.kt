package com.example.hmo_app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.hmo_app.R

@Composable
fun LoginPage (onLogin: () -> Unit, onForgotPassword: () -> Unit, modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ){
        Column (
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // ~~~~ Logo ~~~~
            Box (
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ){
                Text(text="Picture goes here")
//                Image(
//                    painter = painterResource(id = R.drawable.77logo),
//                    contentDescription = null,
//                    contentScale = ContentScale.Fit
//                )
            }
            // ~~~~ Login Card ~~~~
            Box(
                modifier = Modifier
                    .size(300.dp, 300.dp)
                    .background(MaterialTheme.colorScheme.surfaceVariant),
                contentAlignment = Alignment.Center
            ){
                Column (
                    modifier = Modifier,
                    verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // ~~~~ Label ~~~~
                    Text(text = "Login")
                    // ~~~~ Username ~~~~
                    Text(text = "Username")
                    // ~~~~ Password ~~~~
                    Text(text = "Password")
                    // ~~~~ Login Button ~~~~
                    Button(onClick = onLogin) {
                        Text(text = "Login")
                    }
                }
            }
        }
    }
}