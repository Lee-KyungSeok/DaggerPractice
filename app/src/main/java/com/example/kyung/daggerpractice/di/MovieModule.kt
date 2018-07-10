package com.example.kyung.daggerpractice.di

import com.example.kyung.daggerpractice.ui.MoviesFragment
import com.example.kyung.daggerpractice.ui.MoviesFragmentContract
import com.example.kyung.daggerpractice.ui.MoviesPresenterImpl
import dagger.Binds
import dagger.Module

@Module
abstract class MovieModule {

    @FragmentScope
    @Binds
    abstract fun bindPresenter(presenter: MoviesPresenterImpl) : MoviesFragmentContract.Presenter

    @FragmentScope
    @Binds
    abstract fun bindView(fragment: MoviesFragment) : MoviesFragmentContract.View

}