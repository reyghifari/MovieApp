package com.hann.submissionexpert.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hann.submissionexpert.databinding.ActivityDetailBinding

class DetaiMovielActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}