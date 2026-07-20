package com.lyadsky.bablo.presentation.feature1

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun Feature1Screen(
    viewModel: Feature1ViewModel
) {
    val state by viewModel.state.collectAsState()

    Text(text = state.title)
}
