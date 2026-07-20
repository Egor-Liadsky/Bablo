package com.lyadsky.bablo.presentation.feature2

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun Feature2Screen(
    viewModel: Feature2ViewModel
) {
    val state by viewModel.state.collectAsState()

    Button(onClick = { viewModel.increment() }) {
        Text(text = "Count: ${state.counter}")
    }
}
