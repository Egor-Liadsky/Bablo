package com.lyadsky.bablo.presentation.feature2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Feature2ViewModel : ViewModel() {

    private val _state = MutableStateFlow(Feature2State())
    val state: StateFlow<Feature2State> = _state

    fun increment() {
        _state.value = _state.value.copy(counter = _state.value.counter + 1)
    }
}
