package com.example.kitsuclian.domain.usecases

import com.example.kitsuclian.domain.repositories.AnimeRepository
import javax.inject.Inject

class AnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {

    operator fun invoke() = animeRepository.fetchAnime()
}