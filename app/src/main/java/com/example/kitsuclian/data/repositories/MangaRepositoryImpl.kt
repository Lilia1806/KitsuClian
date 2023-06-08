package com.example.kitsuclian.data.repositories

import com.example.kitsuclian.data.remote.apiservices.MangaApiService
import com.example.kitsuclian.data.remote.dtos.toDomain
import com.example.kitsuclian.data.base.BaseRepository
import com.example.kitsuclian.domain.repositories.MangaRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {

    override fun fetchManga() = doRequest {
        mangaApiService.fetchManga().data.map {
            it.toDomain()
        }
    }
}