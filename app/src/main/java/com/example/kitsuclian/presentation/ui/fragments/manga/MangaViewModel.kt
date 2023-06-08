package com.example.kitsuclian.presentation.ui.fragments.manga

import androidx.lifecycle.ViewModel
import com.example.kitsuclian.domain.usecases.MangaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val fetchMangaUseCase: MangaUseCase
) : ViewModel() {

    fun fetchManga() = fetchMangaUseCase.invoke()
}