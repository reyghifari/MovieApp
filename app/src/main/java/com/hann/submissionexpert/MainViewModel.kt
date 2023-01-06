package com.hann.submissionexpert

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hann.core.domain.usecase.MovieUseCase

class MainViewModel(movieUseCase: MovieUseCase) : ViewModel() {
    val movie = movieUseCase.getAllMovie().asLiveData()
}