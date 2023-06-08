package com.example.kitsuclian.data.repositories

import com.example.kitsuclian.data.remote.apiservices.AnimeApiService
import com.example.kitsuclian.data.remote.dtos.toDomain
import com.example.kitsuclian.data.base.BaseRepository
import com.example.kitsuclian.domain.repositories.AnimeRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository(), AnimeRepository {

    override fun fetchAnime() = doRequest {
        animeApiService.fetchAnime().data.map {
            it.toDomain()
        }
    }
}