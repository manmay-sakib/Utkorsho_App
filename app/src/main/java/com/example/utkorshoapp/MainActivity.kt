package com.example.utkorshoapp


import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.utkorshoapp.mcq_screen_components.AnswerCardBox
import com.example.utkorshoapp.mcq_screen_components.DummyAppBar
import com.example.utkorshoapp.mcq_screen_components.McqScreen
import com.example.utkorshoapp.mcq_screen_components.QuestionText
import com.example.utkorshoapp.mcq_screen_components.SateIndicatorCard
import com.example.utkorshoapp.presentation.quiz_result_screen_components.QuizResultScreen
import com.example.utkorshoapp.ui.theme.UtkorshoAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UtkorshoAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEFF3FB)

                ) {
                   QuizResultScreen()
                }
                }
            }
        }
    }

@Preview
@Composable
fun MainScreen() {
    UtkorshoAppTheme {

    }
}