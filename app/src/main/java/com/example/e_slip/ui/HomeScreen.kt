package com.example.e_slip.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.e_slip.R
import com.example.e_slip.ui.theme.Purple200

@ExperimentalMaterialApi
@Composable
fun HomeScreen(context: Context){
    Box(
        modifier = Modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFDDEDEB),
                        Color(0xB9D3DDDC),
                        Color(0x75D6D8D8)
                    )
                )
            )
            .fillMaxSize()

    ) {
        Column {
            TopMenuSection(context)
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun TopMenuSection(context: Context) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(7.5.dp)
    ) {
        Surface(
            onClick = { Toast.makeText(context, "icon clicked", Toast.LENGTH_SHORT).show() },
            color = Color.Transparent,
            modifier = Modifier.clip(CircleShape)
        ) {
           Icon(
               painter = painterResource(id = R.drawable.ic_sort),
               contentDescription = null,
               tint = Color.Black,
               modifier = Modifier.padding(7.5.dp)
           )
        }

        Surface(
            onClick = { Toast.makeText(context, "icon image", Toast.LENGTH_SHORT).show() },
            color = Color.Transparent,
            modifier = Modifier.clip(CircleShape)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_profil),
                contentDescription = null,
                modifier = Modifier
                    .padding(7.5.dp)
                    .size(35.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, Purple200, CircleShape)

            )
        }
    }
}