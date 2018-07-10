package com.example.kyung.daggerpractice.di

import android.support.v4.app.Fragment
import com.example.kyung.daggerpractice.ui.MainActivity
import com.example.kyung.daggerpractice.ui.MainActivityContract
import com.example.kyung.daggerpractice.ui.MainPresenterImpl
import com.example.kyung.daggerpractice.ui.MoviesFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.FragmentKey
import dagger.multibindings.IntoMap



@Module(subcomponents = [MovieFragmentComponent::class])
abstract class MainModule {

    @ActivityScope
    @Binds
    abstract fun bindPresenter(mainPresenter: MainPresenterImpl) : MainActivityContract.Presenter

    @ActivityScope
    @Binds
    abstract fun bindView(activity: MainActivity) : MainActivityContract.View

    @Binds
    @IntoMap
    @FragmentKey(MoviesFragment::class)
    abstract fun bindMoviesFragment(builder: MovieFragmentComponent.Builder) : AndroidInjector.Factory<out Fragment>
}