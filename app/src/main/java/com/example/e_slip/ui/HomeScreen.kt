package com.example.e_slip.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Sort
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_slip.Categories
import com.example.e_slip.R
import com.example.e_slip.ui.theme.GrayChip
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
            SearchBarSection()
            CategorySection()
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
            .padding(vertical = 7.dp, horizontal = 8.dp)
    ) {
        IconButton(
            onClick = {
                Toast.makeText(context, "icon clicked", Toast.LENGTH_SHORT).show()
            },
        ) {
            Icon(
                imageVector = Icons.Default.Sort,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.padding(vertical = 7.dp, horizontal = 8.dp)
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
                    .padding(vertical = 7.dp, horizontal = 8.dp)
                    .size(35.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, Purple200, CircleShape)
            )
        }
    }
}

@Composable
fun SearchBarSection() {
    Row(
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 18.dp)
            .clip(CircleShape)
            .fillMaxWidth()
            .background(Color.White)
            .padding(4.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Search...",
            color = Color.LightGray,
            modifier= Modifier.padding(start = 12.dp),
            fontSize = 12.sp
        )

        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "search",
            modifier = Modifier
                .size(35.dp)
                .background(Purple200, CircleShape)
                .padding(8.dp),
            tint = Color.White
        )
    }
}

@Composable
fun CategorySection() {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = "Categories",
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(vertical = 7.dp, horizontal = 8.dp)
        )
        ChipSection(chips = listOf("Tout", "Dame", "Homme", "Garcon"))
    }
}

@Composable
fun ChipSection(
    chips: List<String>
) {
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow{
        items(chips.size){
            val textColor = if (selectedChipIndex == it) Color.Black else Color.Gray
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(CircleShape)
                    .background(Color.Transparent)
                    .padding(8.dp)
            ) {
                Text(
                    text = chips[it],
                    color = textColor,
                    style = MaterialTheme.typography.body1
                )
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun CategoryItemUi(categories: List<Categories>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(
            start = 7.5.dp,
            end = 7.5.dp,
            bottom = 70.dp
        ),
        modifier = Modifier.fillMaxWidth()
    ){

    }
}