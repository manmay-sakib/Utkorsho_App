package com.example.utkorshoapp.presentation.quiz_result_screen_components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.utkorshoapp.R


@Composable
fun QuizResultAppBar(

) {
   Box (
       modifier = Modifier
           .fillMaxWidth()
           .height(56.dp)
           .background(Color(0xFFEFF3FB)),
   ){
       Image(
           alignment = Alignment.Center,
           painter = painterResource(id = R.drawable.back),
           contentDescription = "null",
           modifier = Modifier
               .padding(start = 16.dp)
               .size(24.dp)
               .align(Alignment.CenterStart)

       )
       Text(
           text = "কুইজ রেজাল্ট",
           modifier = Modifier.align(alignment = Alignment.Center),
           style = TextStyle(
               fontSize = 15.sp,
               //fontFamily = FontFamily(Font(R.font.roboto)),
               fontWeight = FontWeight(700),
               color = Color(0xFF172B4D),
               ),
           )
   }
}

@Preview()
@Composable
fun QuizResultAppBarPreview() {
    QuizResultAppBar()
}


