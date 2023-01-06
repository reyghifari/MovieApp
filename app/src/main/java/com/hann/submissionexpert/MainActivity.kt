package com.hann.submissionexpert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.hann.core.data.Resource
import com.hann.core.ui.MovieAdapter
import com.hann.submissionexpert.databinding.ActivityMainBinding
import com.hann.submissionexpert.detail.DetaiMovielActivity
import com.hann.submissionexpert.favorite.FavoriteActivity
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        val movieAdapter = MovieAdapter()
        movieAdapter.onItemClick = {
            selectedData ->
            val intent = Intent(this, DetaiMovielActivity::class.java)
            intent.putExtra(DetaiMovielActivity.EXTRA_DATA, selectedData)
            startActivity(intent)
        }


        mainViewModel.movie.observe(this){
            if (it!= null){
                when (it) {
                    is Resource.Loading -> binding.progressBar.visibility = View.VISIBLE
                    is Resource.Success -> {
                        binding.progressBar.visibility = View.GONE
                        movieAdapter.setData(it.data)
                    }
                    is Resource.Error -> {
                        binding.progressBar.visibility = View.GONE
                        binding.viewError.root.visibility = View.VISIBLE
                        binding.viewError.tvError.text =
                            it.message ?: getString(R.string.something_wrong)
                    }
                }
            }
        }

        with(binding.rvTourism){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter =movieAdapter
        }

        binding.toolbar.ivMainFavorite.setOnClickListener {
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
        }


    }
}