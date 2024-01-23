package com.example.utkorshoapp.mcq_screen_components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun SateIndicatorCard(
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .height(48.dp)
        .background(Color(0xFFFFFFFF))
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center

    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .horizontalScroll(rememberScrollState())

        ) {
            var selectedBox by remember { mutableStateOf(0) }
            for (i in 1..11) {
                Box(
                    modifier = Modifier
                        .height(32.dp)
                        .width(32.dp)
                        .clip(RoundedCornerShape(100))
                        .border(
                            width = 1.dp,
                            color = Color(0xFFCCEAE1),
                            shape = RoundedCornerShape(size = 100.dp),
                        )
                        .background(if (selectedBox == i) Color(0xFF52B69A) else Color(0xFFFFFF))
                        .clickable { selectedBox = i },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = i.toString(),
                        style = TextStyle(
                            fontSize = 12.sp,
                            //fontFamily = FontFamily(Font(R.font.roboto)),
                            fontWeight = FontWeight(500),
                            color = (if (selectedBox == i) Color(0xFFFFFFFF) else Color(0xFF71828A))
                        )
                    )
                }
            }

        }

    }
}


@Preview
@Composable
fun SateIndicatorCardPreview() {
    SateIndicatorCard()
}



