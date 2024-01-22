package com.example.utkorshoapp.mcq_screen_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AnswerCardBox(qusOptionName: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(Color(0xFFFFFFFF)),
        contentAlignment = Alignment.CenterStart
    ) {
        Row (
            modifier = Modifier.padding(horizontal = 16.dp),
           verticalAlignment = Alignment.CenterVertically

        ){
            Box(
                modifier = Modifier
                    .width(32.dp)
                    .height(32.dp)
                    .clip(shape = RoundedCornerShape(100))
                    .background(Color(0xFFEFF3FB))

                ,

                contentAlignment = Alignment.Center
            ){
                Text(
                    text = qusOptionName,
                    style = TextStyle(
                        fontSize = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.roboto)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF172B4D),
                    )
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "3.3 × 10–18 C",
                //modifier = Modifier.align(Alignment()),
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 19.sp,
                    //fontFamily = FontFamily(Font(R.font.noto sans bengali)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF172B4D),
                )
            )

        }

    }
}

/*
@Preview
@Composable
fun AnswerCardBoxPreview() {
    AnswerCardBox()
}*/
