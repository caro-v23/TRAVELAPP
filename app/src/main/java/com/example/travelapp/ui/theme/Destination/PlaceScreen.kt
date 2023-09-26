package com.example.travelapp.ui.theme.Destination

import android.os.Build.VERSION_CODES.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travelapp.R
import com.example.travelapp.navigation.ROUTE_ADD_PRODUCT
import com.example.travelapp.navigation.ROUTE_PLACE
import com.example.travelapp.ui.theme.Register.RegisterScreen
import com.example.travelapp.ui.theme.TravelAppTheme

@Composable
fun PlaceScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "OUR DESTINATIONS",
            color = Color.Blue,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 30.dp),
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Image(painter = painterResource(id = R.drawa), contentDescription = "",
            modifier = Modifier.size(width = 200.dp, height = 150.dp))


            Column {
                Text(
                    text = "MIAMI BEACH",
                    fontSize = 25.sp,
                    
                )
                Text(text = "The beach is known for its white sand and clear blue water. Visitors can also find a variety of shops, restaurants, and hotels along the beach. Another popular Miami Beach is Bal Harbour. This beach is known for its luxury hotels and upscale shopping.")

            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.casa), contentDescription = "",
                modifier = Modifier.size(width = 200.dp, height = 150.dp))
            Column {
                Text(
                    text = "CASA VILLA",
                    fontSize = 25.sp,
                )
                Text(text = "It gives the calmness one seeks in a rather orthodox setting. The rooms aren't fancy but offers peaceful aura with good sleep")

            
        }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.paradise), contentDescription = "",
            modifier=Modifier.size(width = 200.dp, height = 150.dp))
            Column {
                Text(
                    text = "PARADISE HOTEL",
                    fontSize = 25.sp,
                )
                Text(text = "Whether for business or leisure, our tranquil escape offers refreshing drinks, connectivity, and unforgettable moments in an idyllic paradise. Conferencing.")
                Spacer(modifier = Modifier.height(30.dp))
                Button(onClick = {
                    navController.navigate(ROUTE_ADD_PRODUCT) },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.Red)) {
                    Text(text = "PRODUCTS",
                        modifier = Modifier.padding(10.dp))

                }


            }
        }

        }
    }

@Preview
@Composable
fun PlaceScreenPreview() {
TravelAppTheme {
    PlaceScreen(rememberNavController())


}

    }

