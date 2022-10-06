package io.kraftsman.ui.components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BallMatrix(lotteryNumber: List<Int>) {
    Column(
        modifier = Modifier.height(300.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        (1..49).chunked(7).forEach { row ->
            Row(
                modifier = Modifier.width(300.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                row.forEach { number ->
                    Ball(
                        displayNumber = number,
                        isSelected = number in lotteryNumber,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun BallMatrixPreview() {
    BallMatrix(listOf(1, 2, 3, 4, 5, 6))
}
