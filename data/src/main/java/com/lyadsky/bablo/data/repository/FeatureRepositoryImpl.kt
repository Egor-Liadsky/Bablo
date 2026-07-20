package com.lyadsky.bablo.data.repository

import com.lyadsky.bablo.data.local.FeatureDao
import com.lyadsky.bablo.data.remote.FeatureApi
import com.lyadsky.bablo.domain.model.Feature
import com.lyadsky.bablo.domain.repository.FeatureRepository

class FeatureRepositoryImpl(
    private val api: FeatureApi,
    private val dao: FeatureDao
) : FeatureRepository {

    override suspend fun getFeature(): Feature {
        return Feature(id = 1, title = api.fetchFeature())
    }
}
