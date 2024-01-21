package com.example.utkorshoapp.presentation.components
import androidx.compose.foundation.Image
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
fun TryAgainCard() {
    Box(
        modifier = Modifier
            .width(351.dp)
            .height(56.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(Color(0xFF52B69A))
            .border(
                1.dp, Color(0xFF52B69A),
                shape = RoundedCornerShape(8.dp)
            ),
        contentAlignment = Alignment.Center
    ){
        Row {
            Image(
                painter = painterResource(id = R.drawable.ic_round_refresh),
                contentDescription = "null",
                modifier = Modifier
                    .size(25.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "পুনরায় চেষ্টা কর",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFFFFFFFF),
                )
            )
        }
    }
}

@Preview
@Composable
fun TryAgainCardPreview() {
    TryAgainCard()
}