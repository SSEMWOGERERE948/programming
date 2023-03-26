package com.example.assignment1.screens

import androidx.annotation.Dimension
import com.example.assignment1.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun FavouritesScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color.Yellow),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Title
            Text(
                text = "My Smart Home",
                modifier = Modifier.weight(2f),
                fontSize = MaterialTheme.typography.h6.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            // Search icon
            Icon(
                imageVector = Icons.Filled.Edit,
                contentDescription = "Edit",
                modifier = Modifier.padding(start = 16.dp)
            )
        }

        // Image and text container
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.TopCenter)
                .padding(top = 100.dp) // modified padding
        ) {
            Column(
                modifier = Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "Your Image",
                    modifier = Modifier
                        .size(240.dp) // sets width and height to 240dp
                        .padding(20.dp)

                )
                Text(
                    text = "No Favourites",
                    modifier = Modifier
                        .padding(top = 0.dp),
                    fontSize = MaterialTheme.typography.h4.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
                Column(
                    modifier = Modifier.padding(top = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Add your favourite routines for easy",
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                    )
                    Text(
                        text = "Access here.",
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                    )
                }
                Column(
                    modifier = Modifier.padding(top = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Tap the '+' button below to add your",
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                    )
                    Text(
                        text = "favourite routines. ",
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                    )

                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomEnd)
                .padding(bottom = 58.dp, end = 16.dp)
                .absolutePadding(left = 300.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(Color.Blue, CircleShape)
                    .padding(8.dp)
                    .absolutePadding(left = 4.dp),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.baseline_add_24),
                    contentDescription = "Add",
                    modifier = Modifier.size(30.dp),
                    //  tint = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
fun FavouritesPreview() {
    FavouritesScreen()
}

