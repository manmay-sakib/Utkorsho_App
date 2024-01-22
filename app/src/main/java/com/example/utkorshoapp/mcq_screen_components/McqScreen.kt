package com.example.utkorshoapp.mcq_screen_components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun McqScreen() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(Color(0xFFEFF3FB))
            .verticalScroll(rememberScrollState())
    ) {
        DummyAppBar()
        Spacer(modifier = Modifier.height(16.dp))
        SateIndicatorCard()
        Spacer(modifier = Modifier.height(16.dp))
        QuestionText(question = "একটি চার্জযুক্ত তেল ড্রপ 3 × 104 V m–1 একটি অভিন্ন ক্ষেত্রে স্থগিত করা হয় যাতে এটি পড়ে না বা উঠে না ড্রপের চার্জ (ড্রপের ভর 9.9 × 10-15 kg এবং g = 10 ms–2 নিন)")
        Spacer(modifier = Modifier.height(16.dp))
        AnswerCardBox(qusOptionName = "ক")
        Spacer(modifier = Modifier.height(16.dp))
        AnswerCardBox(qusOptionName = "খ")
        Spacer(modifier = Modifier.height(16.dp))
        AnswerCardBox(qusOptionName = "গ")
        Spacer(modifier = Modifier.height(16.dp))
        AnswerCardBox(qusOptionName = "ঘ")
        Spacer(modifier = Modifier.height(150.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                isBack = true,
                Modifier
                    .width(183.dp)
                    .height(56.dp)
                    .padding(end = 8.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(Color(0xFFD3ECE5))
                    .border(
                        width = 1.dp,
                        color = Color(0xFF52B69A),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .weight(.5f))
            Button(
                isBack = false,
                modifier = Modifier
                    .width(183.dp)
                    .height(56.dp)
                    .padding(start = 8.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(Color(0xFFD3ECE5))
                    .border(
                        width = 1.dp,
                        color = Color(0xFF52B69A),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .weight(.5f))
        }
    }
}



