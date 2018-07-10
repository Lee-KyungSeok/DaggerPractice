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

// 그런데 이제 DaggerAppCompatActivity 가 있으므로 이를 사용하자!!
// => 따로 컴포넌트 작성 안하고 바로 AppModule 에 MainModule 을 넣어주면 된다.
// 현재는 스터디용