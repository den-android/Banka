package net.denis.banka.presentation.screen.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    vm: MainViewModel,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    ) {
        Row {
            Text(
                text = "Scrap = ${vm.viewState.value.scrapState.count}",
            )
            Spacer(modifier = modifier.padding(start = 12.dp))

            Text(
                text = "Oil = ${vm.viewState.value.oilState.count}"
            )
        }
        buttonItems(
            onClickFindScrap = {
                vm.handleEvent(event = MainContract.MainAction.findScrap(1000L))
            },
            onClickFindOil = { vm.handleEvent(event = MainContract.MainAction.findOil) }
        )
    }
}

@Composable
fun buttonItems(
    modifier: Modifier = Modifier,
    onClickFindScrap: () -> Unit,
    onClickFindOil: () -> Unit,
) {
    Button(
        onClick = {
            onClickFindScrap()
        }
    ) {
        Text(text = "Find scrap")
    }

    Spacer(modifier = modifier.padding(bottom = 8.dp))

    Button(
        onClick = { onClickFindOil() }
    ) {
        Text(text = "Find oil")
    }
}