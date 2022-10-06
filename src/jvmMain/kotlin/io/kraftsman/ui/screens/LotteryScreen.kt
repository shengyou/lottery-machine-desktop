package io.kraftsman.ui.screens

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.kraftsman.services.LotteryService
import io.kraftsman.ui.components.BallMatrix

@Composable
fun LotteryScreen() {
    var lotteryNumbers by remember { mutableStateOf(listOf<Int>()) }
    val lotteryService = LotteryService()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BallMatrix(lotteryNumbers)
        Button(
            onClick = { lotteryNumbers = lotteryService.draw() },
            modifier = Modifier.padding(top = 10.dp)
        ) {
            Text(
                text = "Draw"
            )
        }
    }
}

@Preview
@Composable
fun LotteryScreenPreview() {
    LotteryScreen()
}
