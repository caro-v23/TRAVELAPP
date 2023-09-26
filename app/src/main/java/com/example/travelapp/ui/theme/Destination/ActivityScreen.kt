package com.example.travelapp.ui.theme.Destination

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travelapp.ui.theme.TravelAppTheme

@Composable
fun ActivityScreen(navController:NavHostController) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)
        .fillMaxHeight(fraction = Float.MAX_VALUE))

    {
        Text(
            text = "MAIN ACTIVITIES",
            color = Color.Yellow,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 30.dp),
            fontWeight = FontWeight.ExtraBold)

        Spacer(modifier = Modifier.height(25.dp))


            Column {
                Text(
                    text = "MIAMI BEACH",
                    color = Color.Green,
                    fontSize = 25.sp,

                    )
                Text(text = "A welcome drink. " +
                        "\$25 daily Food and Beverage credit (not cumulative) " +
                        "\$30 discounted valet parking (regular \$49, one vehicle only)")


            }
        Spacer(modifier = Modifier.height(25.dp))


        Column {
            Text(
                text = "PARADISE HOTEL",
                color = Color.Green,
                fontSize = 25.sp,

                )
            Text(text = "Bed and Breakfast · "+
                    "\$45 daily Food and drinks (not cumulative) " +
                    "\$50 swimming pool per head"+
                    "free packing ground with basement")


    }



        Column {
            Text(
                text = "CASA VILLA",
                color = Color.Green,
                fontSize = 25.sp,

                )
            Text(text = "love bird breakfast welcome · "+
                    "\$450daily Food and drinks (not cumulative) " +
                    "\$500 swimming pool per head"+
                    "\$600 for hideway paths"+
                    "team building activities" +
                    "free packing ground with basement")





}
}
}

@Preview
@Composable
fun ActivityScreenPreview() {
    TravelAppTheme {
        ActivityScreen(navController = rememberNavController())
    }



}



