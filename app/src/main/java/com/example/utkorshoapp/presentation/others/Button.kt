package com.example.utkorshoapp.presentation.others

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MyButton(onClick:() -> Unit){
    Button(onClick = onClick) {
        Text(text = "Click to See")
    }
}


