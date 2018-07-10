package com.example.kyung.daggerpractice.di

import com.example.kyung.daggerpractice.DaggerSimpleApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class,
    AppModule::class
])
interface AppComponent {

    fun inject(daggerSimpleApp: DaggerSimpleApp)
}