package com.hann.submissionexpert.core.utils

import com.hann.submissionexpert.core.data.source.local.entity.MovieEntity
import com.hann.submissionexpert.core.data.source.remote.response.MovieResponse
import com.hann.submissionexpert.core.domain.model.Movie

object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                movieId = it.id,
                title = it.title,
                original_title = it.original_title,
                overview = it.overview,
                vote_average = it.vote_average,
                poster_path = it.poster_path,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                movieId = it.movieId,
                title = it.title,
                original_title = it.original_title,
                overview = it.overview,
                vote_average = it.vote_average,
                poster_path = it.poster_path,
                isFavorite = false
            )
        }

    fun mapDomainToEntity(input: Movie) = MovieEntity(
        movieId = input.movieId,
        title = input.title,
        original_title = input.original_title,
        overview = input.overview,
        vote_average = input.vote_average,
        poster_path = input.poster_path,
        isFavorite = false
    )
}