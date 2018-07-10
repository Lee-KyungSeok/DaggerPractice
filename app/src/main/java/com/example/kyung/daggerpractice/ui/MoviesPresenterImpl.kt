package com.example.kyung.daggerpractice.ui

import com.example.kyung.daggerpractice.data.DataSource
import javax.inject.Inject

class MoviesPresenterImpl @Inject constructor(
        val view: MoviesFragmentContract.View,
        val dataSource: DataSource
) : MoviesFragmentContract.Presenter{

    override fun loadMovies(category: String) {
        view.setList(dataSource.getMovies(category))
    }
}