package com.example.utkorshoapp.presentation.quiz_result_screen_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun QuizResultScreen() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFEFF3FB))
//    ) {
    LazyColumn(
        modifier = Modifier
            .padding( horizontal = 16.dp,)
            .background(Color(0xFFEFF3FB))
    ) {
        item {
            QuizResultAppBar()
            Spacer(modifier = Modifier.height(16.dp))
            ScoreCardWithProgressIndicator()
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
                //verticalAlignment = Alignment.CenterVertically
            ) {
                RightAnswerResultCard(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        //.weight(.5f)
                )
                WrongAnswerResultCard(
                    modifier = Modifier
                        .padding(start = 8.dp)
                        //.weight(.5f)
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly

            ) {
                TotalTimerCard(
                    //modifier = Modifier
                        //.padding(end = 8.dp)

                )
                AvgTimerCard(
                    //modifier = Modifier
                        //.padding(end = 8.dp)

                )
            }
            Spacer(modifier = Modifier.height(130.dp))
            CheckAnswerCard()
            Spacer(modifier = Modifier.height(16.dp))
            TryAgainCard()
        }
    }
}

@Preview
@Composable
fun QuizResultScreenPreview() {
    QuizResultScreen()
}

