package com.example.kyung.daggerpractice.di

import com.example.kyung.daggerpractice.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import javax.inject.Singleton
import android.app.Activity
import com.example.kyung.daggerpractice.data.DataSource
import com.example.kyung.daggerpractice.data.DataSourceImpl
import dagger.android.AndroidInjector


@Module(subcomponents = [(MainComponent::class)])
abstract class AppModule {

    @Singleton
    @Binds
    abstract fun bindDataSource(dataSource: DataSourceImpl) : DataSource

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract  fun bindMainActivity(builder: MainComponent.Builder) : AndroidInjector.Factory<out Activity>

}