package com.hann.submissionexpert.di

import com.hann.core.domain.usecase.MovieInteractor
import com.hann.core.domain.usecase.MovieUseCase
import com.hann.submissionexpert.MainViewModel
import com.hann.submissionexpert.detail.DetailMovieViewModel
import com.hann.submissionexpert.favorite.FavoriteViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> {
        MovieInteractor(get())
    }
}

val viewModelModule = module {
    viewModel{
        MainViewModel(get())
    }
    viewModel{
        FavoriteViewModel(get())
    }
    viewModel{
        DetailMovieViewModel(get())
    }
}