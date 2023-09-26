package com.example.travelapp.ui.theme.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travelapp.R
import com.example.travelapp.navigation.ROUTE_HOME
import com.example.travelapp.navigation.ROUTE_PLACE

@Composable

fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize(Float.MAX_VALUE)
        .background(color = Color.Gray),
        horizontalAlignment = Alignment.Start
    ) {
    }
    var Context= LocalContext.current
    
    androidx.compose.material3.Text(text = "WELCOME TO THE TRAVEL APP",
    color = Color.Black,
    fontSize = 40.sp,
    fontFamily = androidx.compose.ui.text.font.FontFamily.Cursive)
    Button(onClick = {
        navController.navigate(ROUTE_PLACE)
    }) {

        
    }
    Spacer(modifier = Modifier.height(30.dp))


    Row {
        Image(painter = painterResource(id = R.drawable.villa), contentDescription = "",
            modifier=Modifier.size(width = 400.dp, height = 800.dp))





    }
    
    
}



@Preview
@Composable
fun homePreview() {
    HomeScreen(rememberNavController())
    
}
