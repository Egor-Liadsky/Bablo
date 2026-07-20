package com.lyadsky.bablo.domain.usecase

import com.lyadsky.bablo.domain.model.Feature
import com.lyadsky.bablo.domain.repository.FeatureRepository

class GetFeatureUseCase(
    private val repository: FeatureRepository
) {
    suspend operator fun invoke(): Feature {
        return repository.getFeature()
    }
}
