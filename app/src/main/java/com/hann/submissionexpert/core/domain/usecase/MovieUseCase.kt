package com.hann.submissionexpert.core.domain.usecase

import androidx.lifecycle.LiveData
import com.hann.submissionexpert.core.data.Resource
import com.hann.submissionexpert.core.domain.model.Movie

interface MovieUseCase {
    fun getAllMovie(): LiveData<Resource<List<Movie>>>
    fun getFavoriteMovie(): LiveData<List<Movie>>
    fun setFavoriteMovie(movie: Movie, state: Boolean)
}