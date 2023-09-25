package com.example.travelapp.ui.theme.Register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travelapp.navigation.ROUTE_REGISTER

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController:NavHostController) {

    var name by remember { mutableStateOf(TextFieldValue(text = "")) }
    var email by remember { mutableStateOf(TextFieldValue(text = "")) }
    var pass by remember { mutableStateOf(TextFieldValue(text = "")) }

    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Magenta),
        horizontalAlignment = Alignment.CenterHorizontally


    ){
        Text(text = "Register Here",
            color = Color.Blue,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Cursive,
            fontSize = 20.sp)
        OutlinedTextField(value = email, onValueChange = {email=it},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Button(onClick = {
            navController.navigate(ROUTE_REGISTER)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Dont have account?Click to Register")
        }

    }
}

@Preview
@Composable
fun Register() {
    RegisterScreen(rememberNavController())

}

