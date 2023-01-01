package com.hann.submissionexpert.core.data.source.remote.network

import com.hann.submissionexpert.core.data.source.remote.response.ListMovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("")
    fun getList(): Call<ListMovieResponse>
}