package com.example.assignment1.screens

import androidx.annotation.Dimension
import com.example.assignment1.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
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
fun ThingsScreen() {
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
        )  {
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
                imageVector = Icons.Filled.Search,
                contentDescription = "Search",
                modifier = Modifier.padding(start = 16.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            // Hamburger menu
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "Menu",
                modifier = Modifier.padding(end = 16.dp)
            )
        }

        // Image and text container
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.TopCenter)
                .absolutePadding(top = 50.dp)
        ) {
            Column(
                modifier = Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.things),
                    contentDescription = "Your Image",
                            modifier = Modifier
                                .size(120.dp) // sets width and height to 100dp
                                .padding(5.dp)
                )
                Text(
                    text = "No things",
                    modifier = Modifier
                        .padding(top = 16.dp),
                    fontSize = MaterialTheme.typography.h4.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Column(
                    modifier = Modifier.padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "It looks like we didn't discover any devices.",
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                    )
                    Text(
                        text = "Try an option below",
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                    )
                }
            }
        } // Gray line separator
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.Gray)
                .align(Alignment.Center)
                .padding(vertical = 16.dp)
        )

        // Search icon container
        // Search icon container
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomCenter)
                .absolutePadding(bottom = 270.dp, left = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.Blue, CircleShape)
                    .padding(8.dp)
                    .absolutePadding(left = 4.dp),
                contentAlignment = Alignment.Center

            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                    modifier = Modifier.size(24.dp),
                    tint = Color.White
                )
            }
            Text(
                text = "Run Discovery",
                modifier = Modifier.absolutePadding(left = 60.dp, top = 5.dp),
                fontSize = MaterialTheme.typography.h5.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
        }
        // Add a cloud account icon container
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomCenter)
                .absolutePadding(bottom = 215.dp, left = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.Blue, CircleShape)
                    .padding(8.dp)
                    .absolutePadding(left = 4.dp),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.baseline_add_24),
                    contentDescription = "Search",
                    modifier = Modifier.size(24.dp),
                    //  tint = Color.White
                )
            }
            Text(
                text = "Add a cloud Account",
                modifier = Modifier.absolutePadding(left = 60.dp, top = 5.dp),
                fontSize = MaterialTheme.typography.h5.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
        }
        // view supported devices
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomCenter)
                .absolutePadding(bottom = 160.dp, left = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.Blue, CircleShape)
                    .padding(8.dp)
                    .absolutePadding(left = 4.dp),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.view),
                    contentDescription = "Search",
                    modifier = Modifier.size(24.dp),
                    //  tint = Color.White
                )
            }
            Text(
                text = "View our supported devices",
                modifier = Modifier.absolutePadding(left = 60.dp, top = 5.dp),
                fontSize = MaterialTheme.typography.h5.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
        }
        // contact support
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomCenter)
                .absolutePadding(bottom = 100.dp, left = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.Blue, CircleShape)
                    .padding(8.dp)
                    .absolutePadding(left = 4.dp),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.contact),
                    contentDescription = "Search",
                    modifier = Modifier.size(24.dp),
                    //  tint = Color.White
                )
            }
            Text(
                text = "Contact support",
                modifier = Modifier.absolutePadding(left = 60.dp, top = 5.dp),
                fontSize = MaterialTheme.typography.h5.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
        }
    }
}

    @Preview
    @Composable
    fun ThingsScreenPreview() {
        ThingsScreen()
    }

