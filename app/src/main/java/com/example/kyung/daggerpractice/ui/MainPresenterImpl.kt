package com.example.kyung.daggerpractice.ui

import com.example.kyung.daggerpractice.data.DataSource
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(
        val view: MainActivityContract.View,
        val dataSource: DataSource
) : MainActivityContract.Presenter {

    override fun loadCategory() {
        view.setViewPager(dataSource.getCategory())
    }
}