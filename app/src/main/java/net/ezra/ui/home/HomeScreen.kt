package net.ezra.ui.home

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.android.material.bottomappbar.BottomAppBar
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_PROFILE
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_SERVICES


fun BottomAppBar(actions: @Composable () -> Unit) {
    TODO("Not yet implemented")
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    var isClicked by remember { mutableStateOf(false) }

    val iconColor = if (isClicked) Color.Red else Color.White


    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(text = "Top App Bar")
//                },
//                navigationIcon = {
//                    IconButton(onClick = {}) {
//                        Icon(Icons.Filled.ArrowBack, "backIcon")
//                    }
//                },
//            )
//        },

        content = {
            LazyColumn(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
            ) {
                item {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.height(10.dp))
                            Card(
                                shape = RoundedCornerShape(20.dp)
                            ) {
                                Image(
                                    imageVector = Icons.Default.Person,
                                    contentDescription = "",
                                   modifier = Modifier
                                       .clickable(onClick = {
                                           navController.navigate(ROUTE_SERVICES) {
                                               popUpTo(ROUTE_HOME) { inclusive = true }
                                           }
                                       })
                                )

                            }
                            Spacer(modifier = Modifier.width(10.dp))

                            Column {
                                Text(
                                    text = "Hello,",
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )
                                Text(text = "Stephanie", fontWeight = FontWeight.Bold)
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Column {
                        Text(
                            text = "Where are you going?", fontWeight = FontWeight.W600,
                            style = TextStyle(fontSize = 12.sp), color = Color.Gray
                        )


                    }

                    LazyRow {
                        item {
                            Button(
                                onClick = {
                                    navController.navigate(ROUTE_CONTACT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }, shape = RoundedCornerShape(20.dp),
                                colors = buttonColors(Color(0xffece7e4))
                            )
                            {
                                Text(text = "Hotels", color = Color.Black)
                            }

                            Spacer(modifier = Modifier.width(5.dp))

                            Button(
                                onClick = {
                                    navController.navigate(ROUTE_CONTACT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }, shape = RoundedCornerShape(20.dp),
                                colors = buttonColors(Color(0xffece7e4))
                            ) {
                                Text(text = "Resorts", color = Color.Black)
                            }

                            Spacer(modifier = Modifier.width(5.dp))

                            Button(
                                onClick = {
                                    navController.navigate(ROUTE_SHOP) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }, shape = RoundedCornerShape(20.dp),
                                colors = buttonColors(Color(0xffece7e4))
                            ) {
                                Text(text = "Beachfronts", color = Color.Black)
                            }

                            Spacer(modifier = Modifier.width(5.dp))

                            Button(
                                onClick = {
                                    navController.navigate(ROUTE_SERVICES) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                                shape = RoundedCornerShape(20.dp),
                                colors = buttonColors(Color(0xffece7e4))
                            ) {
                                Text(text = "Popular", color = Color.Black)
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Column(
                        modifier = Modifier

                            .fillMaxSize()
                    ) {
                        Row {
                            Text(
                                text = "Top Rated",
                                fontWeight = FontWeight.W800,
                                style = TextStyle(fontSize = 11.sp)
                            )
                        }

                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    LazyRow(


                    ) {
                        item {
                            Card(
                                shape = RoundedCornerShape(10.dp), modifier = Modifier
                                    .height(250.dp)
                                    .width(200.dp)
                                    .clickable(onClick = {
                                        navController.navigate(ROUTE_PRODUCTS) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    })
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(200.dp)

                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.hotel1),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )

                                    IconButton(
                                        onClick = { /*TODO*/ },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                                        modifier = Modifier.align(alignment = Alignment.TopEnd)

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "Favorite",
                                            tint =  Color.White,
                                            modifier = Modifier
                                                .clickable { isClicked = !isClicked }
                                        )

                                    }

                                }

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Villa Rosa Kempinski",
                                    style = TextStyle(fontSize = 15.sp),
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
//                                  style = MaterialTheme.typography.body2,
                                    maxLines = 2

                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Westlands, Kenya",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )


                            }


                            Spacer(modifier = Modifier.width(10.dp))

                            Card(
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(250.dp)
                                    .clickable(onClick = {
                                        navController.navigate(ROUTE_PRODUCTS) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    })
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(200.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.hotel2),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )


                                    IconButton(
                                        onClick = { /*TODO*/ },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                                        modifier = Modifier.align(alignment = Alignment.TopEnd)

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "Favorite",
                                            tint = Color.White
                                        )

                                    }

                                }

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Sarova Stanley Hotel",
                                    style = TextStyle(fontSize = 15.sp),
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
//                                  style = MaterialTheme.typography.body2,
                                    maxLines = 2

                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Nairobi, Kenya",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )

                            }

                            Spacer(modifier = Modifier.width(10.dp))

                            Card(
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(250.dp)
                                    .clickable(onClick = {
                                        navController.navigate(ROUTE_PRODUCTS) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    })
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(200.dp)
                                )
                                {
                                    Image(
                                        painter = painterResource(id = R.drawable.diani1),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop

                                    )


                                    IconButton(
                                        onClick = { /*TODO*/ },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                                        modifier = Modifier.align(alignment = Alignment.TopEnd)

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "Favorite",
                                            tint = Color.White
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Villa Rosa Kempinski",
                                    style = TextStyle(fontSize = 15.sp),
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
//                                  style = MaterialTheme.typography.body2,
                                    maxLines = 2

                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Westlands, Kenya",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )
                            }

                            Spacer(modifier = Modifier.width(10.dp))

                            Card(
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(250.dp)
                                    .clickable(onClick = {
                                        navController.navigate(ROUTE_PRODUCTS) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    })
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(200.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.hotel2),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )


                                    IconButton(
                                        onClick = { /*TODO*/ },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                                        modifier = Modifier.align(alignment = Alignment.TopEnd)

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "Favorite",
                                            tint = Color.White
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Villa Rosa Kempinski",
                                    style = TextStyle(fontSize = 15.sp),
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
//                                  style = MaterialTheme.typography.body2,
                                    maxLines = 2

                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Westlands, Kenya",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )
                            }


                        }


                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Column{
                        Text(text = "Recent Bookings",
                            fontWeight = FontWeight.W800,
                            style = TextStyle(fontSize = 11.sp)

                        )
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    LazyRow {
                        item {
                            Card(
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(250.dp)
                                    .clickable(onClick = {
                                        navController.navigate(ROUTE_PRODUCTS) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    })
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(200.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.diani1),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )


                                    IconButton(
                                        onClick = { /*TODO*/ },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                                        modifier = Modifier.align(alignment = Alignment.TopEnd)

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "Favorite",
                                            tint = Color.White
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Sarova Whitesands",
                                    style = TextStyle(fontSize = 15.sp),
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
//                                  style = MaterialTheme.typography.body2,
                                    maxLines = 2

                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Mombasa, Kenya",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )
                            }

                            Spacer(modifier = Modifier.width(10.dp))

                            Card(
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(250.dp)
                                    .clickable(onClick = {
                                        navController.navigate(ROUTE_PRODUCTS) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    })
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(200.dp)
                                )
                                {
                                    Image(
                                        painter = painterResource(id = R.drawable.diani2),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop

                                    )


                                    IconButton(
                                        onClick = { /*TODO*/ },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                                        modifier = Modifier.align(alignment = Alignment.TopEnd)

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "Favorite",
                                            tint = Color.White
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Bamburi Beach Hotel",
                                    style = TextStyle(fontSize = 15.sp),
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
//                                  style = MaterialTheme.typography.body2,
                                    maxLines = 2

                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Lamu, Kenya",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )
                            }

                            Spacer(modifier = Modifier.width(10.dp))

                            Card(
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(250.dp)
                                    .clickable(onClick = {
                                        navController.navigate(ROUTE_PRODUCTS) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    })
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(200.dp)
                                )
                                {
                                    Image(
                                        painter = painterResource(id = R.drawable.diani5),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop

                                    )


                                    IconButton(
                                        onClick = { /*TODO*/ },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                                        modifier = Modifier.align(alignment = Alignment.TopEnd)

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "Favorite",
                                            tint = Color.White
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Leopard beach Resort",
                                    style = TextStyle(fontSize = 15.sp),
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
//                                  style = MaterialTheme.typography.body2,
                                    maxLines = 2

                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Mombasa, Kenya",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )
                            }

                            Spacer(modifier = Modifier.width(10.dp))

                            Card(
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(250.dp)
                                    .clickable(onClick = {
                                        navController.navigate(ROUTE_PRODUCTS) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    })
                            )
                            {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(200.dp)
                                )
                                {
                                    Image(
                                        painter = painterResource(id = R.drawable.hotel3),
                                        contentDescription = "",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop

                                    )


                                    IconButton(
                                        onClick = { /*TODO*/ },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                                        modifier = Modifier.align(alignment = Alignment.TopEnd)

                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Favorite,
                                            contentDescription = "Favorite",
                                            tint = Color.White
                                        )

                                    }
                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "The Boma Hotel",
                                    style = TextStyle(fontSize = 15.sp),
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
//                                  style = MaterialTheme.typography.body2,
                                    maxLines = 2

                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(text = "Nairobi, Kenya",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )

                            }




                        }
                    }


                }
            }
        },

        bottomBar = { SottomBar() }




    )


}



@Composable
fun SottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    val navController = rememberNavController()
    BottomNavigation(
        elevation = 10.dp,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White), // Set background color to white
        backgroundColor = Color.White // Optionally, you can also set background color directly



    ) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"",tint = Color.Gray)
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0),
            onClick = {
                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }})
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"",tint = Color.Gray)
        },
            label = { Text(text = "Save") }, selected = (selectedIndex.value == 1),
            onClick = {
                navController.navigate(ROUTE_PRODUCTS) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }})
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.DateRange, "",tint = Color.Gray)
        },
            label = { Text(text = "Booking") }, selected = (selectedIndex.value == 2),
            onClick = {
                navController.navigate(ROUTE_PRODUCTS) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "",tint = Color.Gray)
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
                navController.navigate(ROUTE_PROFILE) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
            })
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

