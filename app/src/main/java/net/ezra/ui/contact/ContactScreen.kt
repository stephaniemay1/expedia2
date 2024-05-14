package net.ezra.ui.contact


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
//import com.google.ai.client.generativeai.type.content
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.ui.products.RatingStars
import net.ezra.ui.theme.AppTheme
import net.ezra.ui.home.SottomBar as BottomBar



@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ContactScreen(navController: NavHostController) {


    Scaffold(

        content = {
            LazyColumn (
                modifier = Modifier
                    .padding(20.dp)
            ){
                item{

                    Card(
                        shape = RoundedCornerShape(10.dp), modifier = Modifier
                            .height(220.dp)
                            .background(Color.White)
                            .fillMaxWidth()
                            .padding(10.dp)
                            .clickable(onClick = {
                                navController.navigate(ROUTE_PRODUCTS) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            })
                    )
                    {
                        Column {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp)

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
                                        tint = Color.White
                                    )

                                }
                                IconButton(
                                    onClick = {navController.navigate(ROUTE_HOME) {
                                        popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                                    } },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                                    modifier = Modifier.align(alignment = Alignment.TopStart)

                                ) {
                                    Icon(
                                        imageVector = Icons.Default.ArrowBack,
                                        contentDescription = "",
                                        tint = Color.White
                                    )

                                }
                            }
                            Text(text = "Villa Rosa Kempinski",
                                modifier = Modifier
                                    .padding(horizontal = 8.dp, vertical = 4.dp)
                                    .fillMaxWidth(),
                                color = Color.Black,
//                                  style = MaterialTheme.typography.body2,
                                maxLines = 2

                            )

                            Text(text = "Westlands, Kenya",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray
                            )

                        }

                    }


                    Card(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                            .height(200.dp)
                            .size(150.dp)
                            .clickable { /* Handle card click */ },
//                          elevation = 8.dp
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.hotel2),
                                    contentDescription = "",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                                IconButton(
                                    onClick = {},
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(8.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Favorite,
                                        contentDescription = "",
                                        tint = Color.White
                                    )
                                }
                            }
                            Text(
                                text = "Sarova Stanley Hotel" +
                                        "",
                                modifier = Modifier
                                    .padding(horizontal = 8.dp, vertical = 4.dp)
                                    .fillMaxWidth(),
                                color = Color.Black,
//                                  style = MaterialTheme.typography.body2,
                                maxLines = 2
                            )

                            Text(text = "Nairobi, Kenya",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray
                            )
                        }
                    }

                    Card(
                        shape = RoundedCornerShape(10.dp), modifier = Modifier
                            .height(220.dp)
                            .fillMaxWidth()
                            .padding(10.dp)
                            .clickable(onClick = {
                                navController.navigate(ROUTE_PRODUCTS) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            })
                    )
                    {
                        Column {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp)

                            ) {
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
                            Text(text = "Serena Beach Resort",
                                modifier = Modifier
                                    .padding(horizontal = 8.dp, vertical = 4.dp)
                                    .fillMaxWidth(),
                                color = Color.Black,
//                                  style = MaterialTheme.typography.body2,
                                maxLines = 2

                            )

                            Text(text = "Mombasa, Kenya",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray
                            )

                        }

                    }







                }
            }


        },
        bottomBar = { BottomBar() }
    )
}

@Composable
fun BottomBar() {
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
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0),onClick = {

            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"",tint = Color.Gray)
        },
            label = { Text(text = "Save") }, selected = (selectedIndex.value == 1), onClick = {

            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.DateRange, "",tint = Color.Gray)
        },
            label = { Text(text = "Booking") }, selected = (selectedIndex.value == 2),
            onClick = {

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "",tint = Color.Gray)
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

