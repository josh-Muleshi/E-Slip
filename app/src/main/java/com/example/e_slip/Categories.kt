package com.example.e_slip

import androidx.annotation.DrawableRes

data class Categories(
    val title: String,
    val price: Int,
    @DrawableRes val favIcon: Int,
    val image: String
)
