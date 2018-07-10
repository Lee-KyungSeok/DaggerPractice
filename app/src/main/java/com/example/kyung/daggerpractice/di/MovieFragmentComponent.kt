package com.example.kyung.daggerpractice.di

import com.example.kyung.daggerpractice.ui.MoviesFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@FragmentScope
@Subcomponent(modules = [MovieModule::class])
interface MovieFragmentComponent : AndroidInjector<MoviesFragment> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MoviesFragment>()
}