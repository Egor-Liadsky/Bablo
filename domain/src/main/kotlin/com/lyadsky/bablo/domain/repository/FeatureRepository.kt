package com.lyadsky.bablo.domain.repository

import com.lyadsky.bablo.domain.model.Feature

interface FeatureRepository {
    suspend fun getFeature(): Feature
}
