package com.example.kyung.daggerpractice.ui

interface MoviesFragmentContract {

    interface View {
        fun setList(movies: List<String>)
    }

    interface Presenter {
        fun loadMovies(category: String)
    }
}