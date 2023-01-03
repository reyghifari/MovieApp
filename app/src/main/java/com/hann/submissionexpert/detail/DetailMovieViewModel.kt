package com.hann.submissionexpert.detail

import androidx.lifecycle.ViewModel
import com.hann.submissionexpert.core.domain.model.Movie
import com.hann.submissionexpert.core.domain.usecase.MovieUseCase

class DetailMovieViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {

    fun setMovieFavorite(movie: Movie, newState: Boolean) {
        return movieUseCase.setFavoriteMovie(movie, newState)
    }

}