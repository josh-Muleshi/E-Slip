package com.example.e_slip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import com.example.e_slip.ui.BottomBar
import com.example.e_slip.ui.theme.ESlipTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ESlipTheme {
                BottomBar(context = this)
            }
        }
    }
}

