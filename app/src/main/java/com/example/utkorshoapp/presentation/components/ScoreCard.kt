package com.example.utkorshoapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScoreCardWithProgressIndicator() {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFFD0DBE5),
                shape = RoundedCornerShape(size = 16.dp)
            )
            .width(351.dp)
            .height(148.dp)
            .background(
                color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(size = 16 .dp)
            )
            .padding(16.dp)
    ) {
        Row {
            Box(
                modifier = Modifier.size(116.dp)
            ) {
                CustomComponent()
            }
            Spacer(modifier = Modifier.width(32.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(170.dp)
                    .height(148.dp)
            ) {
                Text(
                    text = "ধন্যবাদ! তুমি কুইজে পাশ করেছো তোমার প্রাপ্ত স্কোর 80%.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 19.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF172B4D),
                    )
                )
            }

        }

    }
}

@Preview
@Composable
fun ScoreCardWithProgressIndicatorPreview() {

    ScoreCardWithProgressIndicator()
}