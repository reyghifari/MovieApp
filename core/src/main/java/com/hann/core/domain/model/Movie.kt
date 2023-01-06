package com.hann.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val movieId: String,
    val title: String,
    val original_title: String,
    val overview: String,
    val vote_average: Double,
    val poster_path: String,
    val isFavorite: Boolean
) : Parcelable