package com.example.kyung.daggerpractice.ui

interface MainActivityContract {

    interface View {
        fun setViewPager(categories:List<String>)
    }

    interface Presenter {
        fun loadCategory()
    }
}