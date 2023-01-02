package com.hann.submissionexpert.core.domain.repository

import androidx.lifecycle.LiveData
import com.bumptech.glide.load.engine.Resource
import com.hann.submissionexpert.core.domain.model.Movie

interface IMovieRepository {
    fun getAllMovie(): LiveData<com.hann.submissionexpert.core.data.Resource<List<Movie>>>

    fun getFavoriteMovie(): LiveData<List<Movie>>

    fun setFavoriteMovie(movie: Movie, state: Boolean)
}