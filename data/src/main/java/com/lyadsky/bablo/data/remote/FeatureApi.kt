package com.lyadsky.bablo.data.remote

interface FeatureApi {
    suspend fun fetchFeature(): String
}
