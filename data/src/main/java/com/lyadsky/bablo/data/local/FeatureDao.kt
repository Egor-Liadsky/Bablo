package com.lyadsky.bablo.data.local

interface FeatureDao {
    suspend fun saveFeature(value: String)
}
