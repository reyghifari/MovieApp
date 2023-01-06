package com.hann.core.domain.usecase

import androidx.lifecycle.LiveData
import com.hann.core.data.Resource
import com.hann.core.domain.model.Movie
import com.hann.core.domain.repository.IMovieRepository
import kotlinx.coroutines.flow.Flow

class MovieInteractor(private val movieRepository: IMovieRepository) :MovieUseCase {
    override fun getAllMovie(): Flow<Resource<List<Movie>>> {
       return movieRepository.getAllMovie()
    }

    override fun getFavoriteMovie(): Flow<List<Movie>> {
       return movieRepository.getFavoriteMovie()
    }

    override fun setFavoriteMovie(movie: Movie, state: Boolean) {
        return movieRepository.setFavoriteMovie(movie,state)
    }

}