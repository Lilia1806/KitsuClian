package com.example.kitsuclian.presentation.ui.fragments.anime

import androidx.lifecycle.ViewModel
import com.example.kitsuclian.domain.usecases.AnimeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val fetchAnimeUseCase: AnimeUseCase
) : ViewModel() {
    fun fetchAnime() = fetchAnimeUseCase.invoke()
}