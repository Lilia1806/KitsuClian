package com.example.kitsuclian.presentation.ui.fragments.anime.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.kitsuclian.R
import com.example.kitsuclian.databinding.FragmentAnimeDetailBinding
import com.example.kitsuclian.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeDetailFragment :
    BaseFragment<FragmentAnimeDetailBinding, AnimeDetailViewModel>(R.layout.fragment_anime_detail) {

    override val binding by viewBinding(FragmentAnimeDetailBinding::bind)
    override val viewModel: AnimeDetailViewModel by viewModels()
    private val args: AnimeDetailFragmentArgs by navArgs()

    override fun setupSubscribes() {
        binding.textAnimeDetail.text = args.model.attributes.titles.enJp
        Glide.with(binding.imageAnimeDetail).load(args.model.attributes.posterImage.large)
            .into(binding.imageAnimeDetail)
    }
}