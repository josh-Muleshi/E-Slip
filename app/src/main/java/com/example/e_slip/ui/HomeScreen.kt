package com.example.e_slip.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.e_slip.R
import com.example.e_slip.ui.theme.Teal200

@Composable
fun HomeScreen(){
    Box(
        modifier = Modifier
            .background(Teal200)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Home Screen")
    }
}