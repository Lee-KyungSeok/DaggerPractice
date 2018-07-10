package com.example.kyung.daggerpractice.data

interface DataSource {
    fun getMovies(category:String) : List<String>
    fun getCategory() : List<String>
}