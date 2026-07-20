package com.lyadsky.bablo.presentation.feature1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lyadsky.bablo.domain.usecase.GetFeatureUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class Feature1ViewModel(
    private val getFeatureUseCase: GetFeatureUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(Feature1State())
    val state: StateFlow<Feature1State> = _state

    fun load() {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true)
            val feature = getFeatureUseCase()
            _state.value = _state.value.copy(isLoading = false, title = feature.title)
        }
    }
}
