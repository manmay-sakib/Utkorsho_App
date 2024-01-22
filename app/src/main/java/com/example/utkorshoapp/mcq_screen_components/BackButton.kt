package com.example.utkorshoapp.mcq_screen_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.utkorshoapp.R

@Composable
fun Button(isBack: Boolean, modifier: Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = if (isBack) painterResource(id = R.drawable.trending_left) else  painterResource(id = R.drawable.trending_right),
            contentDescription = "Back Arrow",
            modifier = Modifier
                .size(24.dp)
                //.background(Color(0xFF52B69A))
        )

    }
}

@Preview
@Composable
fun BackButtonPreview() {
//    BackButton(isBack = true)
}