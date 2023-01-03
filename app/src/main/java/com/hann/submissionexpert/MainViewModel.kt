package com.hann.submissionexpert

import androidx.lifecycle.ViewModel
import com.hann.submissionexpert.core.domain.usecase.MovieUseCase

class MainViewModel(movieUseCase: MovieUseCase) : ViewModel() {
    val movie = movieUseCase.getAllMovie()
}