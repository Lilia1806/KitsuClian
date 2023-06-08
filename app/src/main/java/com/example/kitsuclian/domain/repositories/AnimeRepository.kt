package com.example.kitsuclian.domain.repositories

import com.example.kitsuclian.domain.models.DataItem
import com.example.kitsuclian.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    fun fetchAnime(): Flow<Resource<List<DataItem>>>
}