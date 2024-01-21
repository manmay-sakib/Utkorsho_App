package com.example.utkorshoapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.utkorshoapp.R

@Composable
fun CourseCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF52B69A)
        )
    ) {
        Column(modifier = Modifier
            .fillMaxSize())
        {
            Image(
                painter = painterResource(
                    id = R.drawable.course_image_2
                ),
                contentDescription = "null",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "পদার্থবিজ্ঞান ১ম পত্র",
                modifier = Modifier.padding(start = 16.dp),
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF172B4D),

                )
            )
            Row(
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Text(
                    text = "৳১২০০ ",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(500),
                        textDecoration = TextDecoration.LineThrough,
                        color = Color.White
                    )
                )
                Spacer(modifier = Modifier.padding(start = 4.dp))
                Text(
                    text = "৳৯০০ (২৫% ছাড়ে)",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(700),
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun CourseCardPreview() {
    CourseCard()
}
