package com.example.utkorshoapp.presentation.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.utkorshoapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(modifier: Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(88.dp)
            .background(
                Color(0xFF52B69A),
                shape = RoundedCornerShape(bottomStart = 30.dp)
            )
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0x33FFFFFF),
                    shape = RoundedCornerShape(size = 100.dp)
                )
                .matchParentSize()
                .background(color = Color(0x1AFFFFFF), shape = RoundedCornerShape(size = 100.dp))
                .padding(start = 4.dp, top = 4.dp, end = 8.dp, bottom = 4.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.profile_1),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(48.dp)
                        .height(48.dp)
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(Color.White)

                )
                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                ) {
                    Text(
                        text = "Hi! Mehedi",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                    Row {
                        Text(
                            text = "Class 10 | Science",
                            style = TextStyle(
                                fontSize = 11.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFFFFFFFF),
                            )
                        )

                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Box(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0x33FFFFFF),
                            shape = RoundedCornerShape(size = 100.dp)
                        )
                        .size(width = 96.dp, height = 40.dp)

                        .background(
                            color = Color(0x26000000),
                            shape = RoundedCornerShape(size = 100.dp)
                        )
                        .padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.report),
                            contentDescription = "image description",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .size(24.dp)


                        )
                        Box(modifier = Modifier.padding(horizontal = 12.dp)) {
                            Divider(
                                color = Color.White,
                                modifier = Modifier
                                    .fillMaxHeight()  //fill the max height
                                    .width(1.dp)
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.notificaton),
                            contentDescription = "null",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .size(24.dp)
                                .clickable {


                                }
                        )
                    }
                }


            }
        }


    }
}





@Preview
@Composable
fun AppBarPreview() {
    AppBar(modifier = Modifier)
}


/*
Image(
painter = painterResource(id = R.drawable.report),
contentDescription = "image description",
contentScale = ContentScale.None,
modifier = Modifier
//.padding(0.dp)
//.width(0.5.dp)
.height(18.5.dp)
.background(color = Color(0x40FFFFFF))
)
*/






