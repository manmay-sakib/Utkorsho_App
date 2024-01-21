package com.example.utkorshoapp.presentation.components

import android.graphics.Paint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomCircularProgressIndicator(
    modifier: Modifier = Modifier,
    intialValue: Int,
    primaryColor: Color,
    secondaryColor: Color,
    minvalue: Int = 0,
    maxValue: Int = 5,
    circleRadius: Float,
    onPositionChange: (Int) -> Unit

    ) {

    var circleCenter by remember {
        mutableStateOf(Offset.Zero)
    }

    var positionValue by  remember{
        mutableStateOf(intialValue)
    }

    Box(
        modifier = Modifier
    ){
       androidx.compose.foundation.Canvas(
           modifier = Modifier
               .fillMaxSize()
           ,
           onDraw = {
               val width = size.width
               val height = size.height
               val circleThickness = width / 30f
               circleCenter = Offset(x = width/2f, y = height/2f)

               drawCircle(
                   brush = Brush.radialGradient(
                       listOf(
                           primaryColor,
                           secondaryColor,

                       )
                   ),
                   radius = circleRadius,
                   center = circleCenter,
               )

               drawCircle(
                   style = Stroke(
                       width = circleThickness
                   ),
                   color = secondaryColor,
                   radius = circleRadius,
                   center = circleCenter
               )
               drawArc(
                   color = primaryColor,
                   startAngle = 90f,
                   sweepAngle = (360f/maxValue) * positionValue.toFloat(),
                   style = Stroke(
                       width = circleThickness,
                       cap = StrokeCap.Round
                   ),
                   useCenter = false,
                   size = Size(
                       width = circleRadius * 2f,
                       height = circleRadius * 2f
                   ),
                   topLeft = Offset(
                       (width - circleRadius * 2f)/2f,
                       (height - circleRadius * 2f)/2f
                   )
               )

               drawContext.canvas.nativeCanvas.apply {
                   drawIntoCanvas {
                       drawText(
                           "$positionValue",
                           circleCenter.x,
                           circleCenter.y + 45.dp.toPx()/3f,
                           Paint().apply {
                               textSize = 38.sp.toPx()
                               textAlign = Paint.Align.CENTER
                               color = Color.White.toArgb()
                               isFakeBoldText = true
                           }
                       )
                   }
               }


           }

       )

    }

}

@Preview(showBackground = true)
@Composable
fun CustomCircularProgressIndicatorPreview() {
    CustomCircularProgressIndicator(
        intialValue = 10,
        primaryColor = Color.Green,
        secondaryColor = Color.DarkGray,
        circleRadius = 230f,
        onPositionChange = {

        }
    )
}

