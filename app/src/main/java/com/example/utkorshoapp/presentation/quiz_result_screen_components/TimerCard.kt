package com.example.utkorshoapp.presentation.quiz_result_screen_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.utkorshoapp.R


@Composable
fun TotalTimerCard(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .height(106.dp)
            .width(167.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Color(0xFFFFFFFF))

    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.timer),
                contentDescription ="null",
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "10m 30sec",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF172B4D),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "মোট  সময়",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF71828A),
                )
            )

        }

    }
}

@Composable
fun AvgTimerCard(
    modifier: Modifier = Modifier

) {
    Box(
        modifier = Modifier
            .height(106.dp)
            .width(167.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Color(0xFFFFFFFF))
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
           Row {
               Image(
                   modifier = Modifier.size(24.dp),
                   painter = painterResource(id = R.drawable.timer),
                   contentDescription ="null",
               )
               Spacer(modifier = Modifier.width(8.dp))
               Image(
                   modifier = Modifier.size(24.dp),
                   painter = painterResource(id = R.drawable.priority_high),
                   contentDescription ="null",
               )
           }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "1m 30sec",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF172B4D),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "গড় সময় / উত্তর",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF71828A),
                )
            )
        }
    }
}


@Preview
@Composable
fun TotalTimerCardPreview() {
    AvgTimerCard()
}