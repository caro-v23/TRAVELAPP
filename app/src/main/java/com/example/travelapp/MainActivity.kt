package com.example.travelapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.core.app.ComponentActivity
import com.example.travelapp.navigation.AppNavHost

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            AppNavHost()
        }
    }
}