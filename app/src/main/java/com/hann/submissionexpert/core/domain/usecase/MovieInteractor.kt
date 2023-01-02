package com.hann.submissionexpert.core.domain.usecase

import androidx.lifecycle.LiveData
import com.hann.submissionexpert.core.data.Resource
import com.hann.submissionexpert.core.domain.model.Movie
import com.hann.submissionexpert.core.domain.repository.IMovieRepository

class MovieInteractor(private val movieRepository: IMovieRepository) :MovieUseCase {
    override fun getAllMovie(): LiveData<Resource<List<Movie>>> {
       return movieRepository.getAllMovie()
    }

    override fun getFavoriteMovie(): LiveData<List<Movie>> {
       return movieRepository.getFavoriteMovie()
    }

    override fun setFavoriteMovie(movie: Movie, state: Boolean) {
        return movieRepository.setFavoriteMovie(movie,state)
    }

}