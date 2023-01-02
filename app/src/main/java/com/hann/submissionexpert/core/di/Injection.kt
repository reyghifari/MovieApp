package com.hann.submissionexpert.core.di

import android.content.Context
import com.hann.submissionexpert.core.data.MovieRepository
import com.hann.submissionexpert.core.data.source.local.LocalDataSource
import com.hann.submissionexpert.core.data.source.local.room.MovieDatabase
import com.hann.submissionexpert.core.data.source.remote.RemoteDataSource
import com.hann.submissionexpert.core.data.source.remote.network.ApiConfig
import com.hann.submissionexpert.core.domain.repository.IMovieRepository
import com.hann.submissionexpert.core.domain.usecase.MovieInteractor
import com.hann.submissionexpert.core.domain.usecase.MovieUseCase
import com.hann.submissionexpert.core.utils.AppExecutors

object Injection {
    private fun provideRepository(context: Context): IMovieRepository {
        val database = MovieDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(ApiConfig.provideApiService())
        val localDataSource = LocalDataSource.getInstance(database.movieDao())
        val appExecutors = AppExecutors()

        return MovieRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideMovieUseCase(context: Context): MovieUseCase {
        val repository = provideRepository(context)
        return MovieInteractor(repository)
    }
}
