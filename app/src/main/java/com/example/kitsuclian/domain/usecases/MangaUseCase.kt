package com.example.kitsuclian.domain.usecases

import com.example.kitsuclian.domain.repositories.MangaRepository
import javax.inject.Inject

class MangaUseCase @Inject constructor(
    private val mangaRepository: MangaRepository
) {

    operator fun invoke() = mangaRepository.fetchManga()
}