package com.example.utkorshoapp.presentation.quiz_result_screen_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WrongAnswerResultCard(
    modifier: Modifier
) {
    Box(
        modifier = Modifier
            .height(85.dp)
            .width(167.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(Color(0xFFFF4D4D))

    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical =12.dp )
        ) {
            Text(
                text = "4",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFF2F2F2),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "ভুল উত্তর",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFFEFF3FB),
                )
            )
        }
    }
}

@Composable
fun RightAnswerResultCard(
    modifier: Modifier
) {
    Box(
        modifier = Modifier
            .height(85.dp)
            .width(167.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(Color(0xFF00BC4F))

    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical =12.dp )
        ) {
            Text(
                text = "4",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFF2F2F2),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "সঠিক উত্তর",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFFEFF3FB),
                )
            )
        }
    }
}

@Preview
@Composable
fun ResultCardPreview() {
    RightAnswerResultCard(modifier = Modifier)

}