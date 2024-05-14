package net.ezra.ui.products

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_PROFILE
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.ui.home.SottomBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProductsScreen(navController: NavHostController) {
    Scaffold(

        content = {
            LazyColumn {
                item {

                    Column(
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                    ) {
                        Box (
                            modifier = Modifier
                                .fillMaxSize()
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.hotel2),
                                contentDescription = "",
                                modifier = Modifier.fillMaxWidth(),
                                contentScale = ContentScale.Crop

                            )

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

                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(text = "Villa Rosa Kempinski", fontWeight = FontWeight.W900, fontSize = 20.sp)
                        Text(text = "Westlands, Kenya", fontSize = 10.sp, color = Color.Gray)
                        RatingStars(rating = 4)

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = "Popular Facilities", fontWeight = FontWeight.W600, fontSize = 12.sp)


                        Column {

                                Card(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .height(60.dp)
                                        .fillMaxWidth()

//                                   elevation = 8.dp
                                ) {
                                    Row{
                                        androidx.compose.foundation.Image(
                                            painter = painterResource(id = R.drawable.wifi),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(60.dp)
                                                .height(60.dp),
                                            contentScale = ContentScale.Crop
                                        )
                                        Text(
                                            text = "Wifi",
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .fillMaxWidth(),
                                            textAlign = TextAlign.Center,
                                            color = Color.Black
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.width(10.dp))

                                Card(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .height(60.dp)
                                        .fillMaxWidth()

//                                   elevation = 8.dp
                                ) {
                                    Row {
                                        androidx.compose.foundation.Image(
                                            painter = painterResource(id = R.drawable.ic_person),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(60.dp)
                                                .height(60.dp),
                                            contentScale = ContentScale.Crop
                                        )
                                        Text(
                                            text = "Restraunt",
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .fillMaxWidth(),
                                            textAlign = TextAlign.Center,
                                            color = Color.Black
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.width(10.dp))

                                Card(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .height(60.dp)
                                        .fillMaxWidth()

//                                   elevation = 8.dp
                                ) {
                                    Row {
                                        androidx.compose.foundation.Image(
                                            painter = painterResource(id = R.drawable.ic_person),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(60.dp)
                                                .height(60.dp),
                                            contentScale = ContentScale.Crop
                                        )
                                        Text(
                                            text = "Elevator",
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .fillMaxWidth(),
                                            textAlign = TextAlign.Center,
                                            color = Color.Black
                                        )
                                    }
                                }


                            Spacer(modifier = Modifier.height(10.dp))


                                Card(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .height(60.dp)
                                        .fillMaxWidth()

//                                   elevation = 8.dp
                                ) {
                                    Row {
                                        androidx.compose.foundation.Image(
                                            painter = painterResource(id = R.drawable.park),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(60.dp)
                                                .height(60.dp),
                                            contentScale = ContentScale.Crop
                                        )
                                        Text(
                                            text = "Parking",
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .fillMaxWidth(),
                                            textAlign = TextAlign.Center,
                                            color = Color.Black
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.width(10.dp))

                                Card(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .height(60.dp)
                                        .fillMaxWidth()

//                                   elevation = 8.dp
                                ) {
                                    Row {
                                        androidx.compose.foundation.Image(
                                            painter = painterResource(id = R.drawable.pool),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(60.dp)
                                                .height(60.dp),
                                            contentScale = ContentScale.Crop
                                        )
                                        Text(
                                            text = "Pool",
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .fillMaxWidth(),
                                            textAlign = TextAlign.Center,
                                            color = Color.Black
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.width(10.dp))

                                Card(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .height(60.dp)
                                        .fillMaxWidth()

//                                   elevation = 8.dp
                                ) {
                                    Row{
                                        androidx.compose.foundation.Image(
                                            painter = painterResource(id = R.drawable.ic_person),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(60.dp)
                                                .height(60.dp),
                                            contentScale = ContentScale.Crop
                                        )
                                        Text(
                                            text = "Gym",
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .fillMaxWidth(),
                                            textAlign = TextAlign.Center,
                                            color = Color.Black
                                        )
                                    }
                                }



                        }
                    }





                }


            }







        },
        bottomBar = { BottomNav() }
    )
}

@Composable
fun BottomNav() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation (

        backgroundColor = Color.White
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Ksh 41,659",
                color = Color.Black,
                fontWeight = FontWeight.W900,
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.Black ),
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)


            ) {
                Text(text = "Book Now", color = Color.White)
            }
        }
    }
}


@Composable
fun RatingStars(rating: Int) {
    Row {
        repeat(rating) {
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "Star",
                modifier = Modifier.size(15.dp),
                tint = Color.Yellow
            )
        }
    }

}



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}

