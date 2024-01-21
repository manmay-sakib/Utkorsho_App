package com.example.utkorshoapp


import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.utkorshoapp.presentation.components.AvgTimerCard
import com.example.utkorshoapp.presentation.components.CheckAnswerCard
import com.example.utkorshoapp.presentation.components.QuizResultAppBar
import com.example.utkorshoapp.presentation.components.RightAnswerResultCard
import com.example.utkorshoapp.presentation.components.ScoreCardWithProgressIndicator
import com.example.utkorshoapp.presentation.components.TotalTimerCard
import com.example.utkorshoapp.presentation.components.TryAgainCard
import com.example.utkorshoapp.presentation.components.WrongAnswerResultCard
import com.example.utkorshoapp.ui.theme.UtkorshoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UtkorshoAppTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFEFF3FB)),
                    ) {
                    QuizResultAppBar()
                    Column(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Spacer(modifier = Modifier.height(42.dp))
                        ScoreCardWithProgressIndicator()
                        Spacer(modifier = Modifier.height(24.dp))
                        Row{
                            RightAnswerResultCard()
                            Spacer(modifier = Modifier.width(16.dp))
                            WrongAnswerResultCard()
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        Row {
                            TotalTimerCard()
                            Spacer(modifier = Modifier.width(16.dp))
                            AvgTimerCard()
                        }
                        Spacer(modifier = Modifier.height(86.dp))
                        CheckAnswerCard()
                        Spacer(modifier = Modifier.height(16.dp))
                        TryAgainCard()
                    }
                }
                }
            }
        }
    }
