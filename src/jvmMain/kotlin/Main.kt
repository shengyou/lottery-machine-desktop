import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import io.kraftsman.ui.screens.LotteryScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Lottery Machine",
        state = WindowState(
            size = DpSize(500.dp, 700.dp),
            position = WindowPosition.Aligned(Alignment.Center)
        )
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            LotteryScreen()
        }
    }
}
