package com.example.kyung.daggerpractice.di

import com.example.kyung.daggerpractice.ui.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

// ActivityScope 로 설정
// SubComponent 로 설정
@ActivityScope
@Subcomponent(modules = [MainModule::class]) // MainModule 을 install
interface MainComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}