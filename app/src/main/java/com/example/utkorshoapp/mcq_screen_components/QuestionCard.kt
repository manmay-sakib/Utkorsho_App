package com.example.utkorshoapp.mcq_screen_components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun QuestionText(question: String, modifier: Modifier) {
    Text(
        text =  question,
        style = TextStyle(
            fontSize = 13.sp,
            lineHeight = 19.sp,
            //fontFamily = FontFamily(Font(R.font.noto sans bengali)),
            fontWeight = FontWeight(400),
            color = Color(0xFF172B4D),
        )
    )
}

/*
@Preview
@Composable
fun QuestionTextPreview() {
    QuestionText(question = "একটি চার্জযুক্ত তেল ড্রপ 3 × 104 V m–1 একটি অভিন্ন ক্ষেত্রে স্থগিত করা হয় যাতে এটি পড়ে না বা উঠে না ড্রপের চার্জ (ড্রপের ভর 9.9 × 10-15 kg এবং g = 10 ms–2 নিন)")
}*/
