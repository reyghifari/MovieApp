package com.hann.core.data.source.remote.network

import com.hann.core.data.source.remote.response.ListMovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/3/movie/popular?api_key=ad70b1a0982af1b93f36caa498f9bf91")
    suspend fun getList(): ListMovieResponse
}