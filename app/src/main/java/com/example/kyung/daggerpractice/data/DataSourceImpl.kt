package com.example.kyung.daggerpractice.data

import java.util.*
import javax.inject.Inject

class DataSourceImpl @Inject constructor() : DataSource {

    private val CATEGORIES = listOf("SF", "DRAMA")
    private val DRAMA = listOf("Table 19", "Fifty Shades Darker", "Dunkirk", "The Founder")
    private val SF = listOf("Power Rangers", "Wonder Woman", "Spider-Man: Homecoming", "Transformers: The Last Knight", "The Dark Tower")

    override fun getMovies(category: String): List<String> {
        return if (category == "SF") SF else DRAMA
    }

    override fun getCategory(): List<String> {
        return CATEGORIES
    }
}