package net.denis.banka.presentation.screen.main_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun ButtonLinearProgressIndicator(
    modifier: Modifier = Modifier,
) {
    var progress by remember { mutableStateOf(1f) }
    val scope = rememberCoroutineScope()
    var enabled by remember { mutableStateOf(true) }

    Box {
        LinearProgressIndicator(
            modifier = modifier
                .fillMaxWidth()
                .height(30.dp)
                .clickable(enabled = enabled) {
                    enabled = false
                    progress = 1.1f
                    scope.launch {
                        while (progress >= 0f) {
                            progress -= 0.05f
                            delay(50L)
                        }
                    }
                }
                .padding(4.dp)
                .background(Color.Gray),
            progress = progress,
            backgroundColor = Color.Black,
            color = Color.LightGray,
        )
        Text(
            text = "FIND SCRAP",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            color = Color.White,
            modifier = modifier
                .fillMaxWidth()
        )
    }
}


@Preview(showBackground = true)
@Composable
fun showBLPI() {
    ButtonLinearProgressIndicator()
}