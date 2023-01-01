package com.hann.submissionexpert.core.data.source.local

import androidx.lifecycle.LiveData
import com.hann.submissionexpert.core.data.source.local.entity.MovieEntity
import com.hann.submissionexpert.core.data.source.local.room.MovieDao

class LocalDataSource private constructor(private val movieDao: MovieDao) {

    companion object {
        private var instance: LocalDataSource? = null

        fun getInstance(movieDao: MovieDao): LocalDataSource =
            instance ?: synchronized(this) {
                instance ?: LocalDataSource(movieDao)
            }
    }

    fun getAllTourism(): LiveData<List<MovieEntity>> = movieDao.getAllMovie()

    fun getFavoriteTourism(): LiveData<List<MovieEntity>> = movieDao.getFavoriteMovie()

    fun insertTourism(movieList: List<MovieEntity>) = movieDao.insertMovie(movieList)

    fun setFavoriteTourism(movie: MovieEntity, newState: Boolean) {
        movie.isFavorite = newState
        movieDao.updateFavoriteMovie(movie)
    }
}