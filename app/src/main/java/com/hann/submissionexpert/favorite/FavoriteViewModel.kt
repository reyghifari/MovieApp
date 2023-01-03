package com.hann.submissionexpert.favorite

import androidx.lifecycle.ViewModel
import com.hann.submissionexpert.core.domain.usecase.MovieUseCase

class FavoriteViewModel(movieUseCase: MovieUseCase) : ViewModel() {
    val favoriteMovie = movieUseCase.getFavoriteMovie()
}