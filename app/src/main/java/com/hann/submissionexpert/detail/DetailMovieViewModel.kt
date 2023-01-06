package com.hann.submissionexpert.detail

import androidx.lifecycle.ViewModel
import com.hann.core.domain.model.Movie
import com.hann.core.domain.usecase.MovieUseCase

class DetailMovieViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {

    fun setMovieFavorite(movie: Movie, newState: Boolean)= movieUseCase.setFavoriteMovie(movie, newState)


}