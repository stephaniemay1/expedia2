package net.ezra.ui.profile


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.ui.home.SottomBar
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ServicesScreen(navController: NavHostController) {
    Scaffold(

        content = {
            Column {
                Row {
                    IconButton(
                        onClick = {navController.navigate(ROUTE_HOME) {
                            popUpTo(ROUTE_SERVICES) { inclusive = true }
                        } },
//                                                    colors = ButtonDefaults.buttonColors(Color.Transparent),
//                        modifier = Modifier.align(alignment = Alignment.TopStart)

                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "",
                            tint = Color.Black
                        )

                    }
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(text = "My Profile",
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier
                        .fillMaxWidth()
                            .padding(5.dp),
                        textAlign = TextAlign.Center

                    )
                }

                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card (
                        modifier = Modifier
                            .padding(5.dp)
                            .height(90.dp)
                            .width(90.dp),
                        shape = CircleShape
                    ){
                        Image(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(90.dp),
                            contentScale = ContentScale.Crop

                        )

                    }
                    Button(
                        onClick = {navController.navigate(ROUTE_SIGNUP) {
                            popUpTo(ROUTE_SERVICES) { inclusive = true }
                        } },
                        colors = ButtonDefaults.buttonColors(Color(0xff87CEEB) ),
                        modifier = Modifier
                            .padding(start = 16.dp, end = 16.dp)


                    ) {
                        Text(text = "Sign In", color = Color.White)
                    }

                    Button(
                        onClick = {navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_SERVICES) { inclusive = true }
                        } },
                        colors = ButtonDefaults.buttonColors(Color(0xff87CEEB) ),
                        modifier = Modifier
                            .padding(start = 16.dp, end = 16.dp)


                    ) {
                        Text(text = "Log In", color = Color.White)
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
    ServicesScreen(rememberNavController())
}

