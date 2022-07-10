package com.express.android.moviecatalog2.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MoviesViewModel(val repo: MoviesRepo) : ViewModel() {

    private var _movies: MutableLiveData<Resource<List<Movie>>> = MutableLiveData()
    val movies: LiveData<Resource<List<Movie>>> get() = _movies


    private fun getMovies() {
        viewModelScope.launch {
            repo.
        }
    }
}