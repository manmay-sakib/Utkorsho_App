package com.example.utkorshoapp.presentation.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomComponent(
    canvasSize: Dp = 300.dp,
    indicatorValue: Int = 4,
    maxIndicatorValue: Int = 5,
    backgroundIndicatorColor: Color = Color(0xFFCCEAE1),
    backgroundIndicatorStrokeWidth: Float = 30f,
    foregroundIndicatorColor: Color = Color(0xFF52B69A),
    foregroundIndicatorStrokeWidth: Float = 30f,

) {
    var allowedIndicatorValue by remember {
        mutableIntStateOf(maxIndicatorValue)
    }
    allowedIndicatorValue = if (indicatorValue<= maxIndicatorValue){
        indicatorValue
    } else{
        maxIndicatorValue
    }

    var animatedIndicatorValue by remember{ mutableStateOf(0f)}
    LaunchedEffect(key1 = allowedIndicatorValue){
        animatedIndicatorValue = allowedIndicatorValue.toFloat()
    }
    val percentage =
        // main formula for the animation
        (animatedIndicatorValue / maxIndicatorValue) *100

    val sweepAngle by animateFloatAsState(
        targetValue = (3.6 * percentage).toFloat(),
        animationSpec = tween(1000)
    )

    Column(
        modifier = Modifier
            .size(canvasSize)
            .drawBehind {
                val componentSize = size / 1.25f
                backgroundIndicator(
                    componentSize = componentSize,
                    indicatorColor = backgroundIndicatorColor,
                    indicatorStrokeWidth = backgroundIndicatorStrokeWidth,
                )
                foregroundIndicator(
                    sweepAngle = sweepAngle,
                    componentSize = componentSize,
                    indicatorColor = foregroundIndicatorColor,
                    indicatorStrokeWidth = foregroundIndicatorStrokeWidth,
                )
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EmbeddedTextElements(
            bigText = allowedIndicatorValue,
            bigTextColor = Color(0xFF52B69A)
        )
    }
}

fun DrawScope.backgroundIndicator(
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float,
    ){
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f,
        sweepAngle = 360f,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        ),
        // For centering the component
        topLeft = Offset(
            x = (size.width - componentSize.width)/2f,
            y = (size.height - componentSize.height)/2f
        )
    )
}

fun DrawScope.foregroundIndicator(
    sweepAngle: Float,
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float,
    ){
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 270f,
        sweepAngle = sweepAngle,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        ),
        // For centering the component
        topLeft = Offset(
            x = (size.width - componentSize.width)/2f,
            y = (size.height - componentSize.height)/2f
        )
    )
}

@Composable
fun EmbeddedTextElements(
    bigText: Int,
    bigTextColor: Color,
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "$bigText",
            color = bigTextColor,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            )
        Spacer(modifier = Modifier.width(2.dp))
        Text(
            text = "/",
            color = Color(0xFF71828A),
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            )
        Spacer(modifier = Modifier.width(2.dp))
        Text(
            text = "5",
            fontWeight = FontWeight(400),
            lineHeight = 22.sp,
            color = Color(0xFF71828A),
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            )
    }
    Text(
        text = "তোমার স্কোর",
        style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF172B4D),
        )
    )
}


@Preview(showBackground = true)
@Composable
fun CustomComponentPreview() {
    CustomComponent()
}