package com.example.kitsuclian.domain.di

import com.example.kitsuclian.data.repositories.AnimeRepositoryImpl
import com.example.kitsuclian.data.repositories.MangaRepositoryImpl
import com.example.kitsuclian.domain.repositories.AnimeRepository
import com.example.kitsuclian.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun provideMangaRepository(repositoryImpl: MangaRepositoryImpl): MangaRepository

    @Binds
    fun provideAnimeRepository(repositoryImpl: AnimeRepositoryImpl): AnimeRepository
}