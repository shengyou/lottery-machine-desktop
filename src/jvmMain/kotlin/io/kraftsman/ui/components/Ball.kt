package io.kraftsman.ui.components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Ball(
    displayNumber: Int,
    isSelected: Boolean,
) {
    Box(
        modifier = Modifier.size(40.dp)
            .clip(CircleShape)
            .background(if (isSelected) Color.Red else Color.Gray)
    ) {
        Text(
            text = displayNumber.toString(),
            color = Color.White,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.size(40.dp)
                .offset(0.dp, 6.dp)
        )
    }
}

@Preview
@Composable
fun BallPreview() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Ball(
            displayNumber = 10,
            isSelected = false,
        )
    }
}
