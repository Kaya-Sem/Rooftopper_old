package com.rooftopper

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun locationComposable(location: Location, modifier: Modifier) {
    Text(text = location.name)
    Text(text = location.description)
    Text(text = location.tags.toString())
}