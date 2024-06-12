package com.rooftopper

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun locationComposable(location: Location, modifier: Modifier = Modifier) {

    Card(modifier = modifier.padding(5.dp)) {
        Row(modifier = modifier.padding(5.dp)) {
            Text(text = location.name)
            Text(text = location.description)
        }
    }
}