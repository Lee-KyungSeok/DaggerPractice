package com.example.kyung.daggerpractice.ui

import android.os.Bundle
import com.example.kyung.daggerpractice.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainActivityContract.View {

    @Inject lateinit var presenter: MainActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.loadCategory()
    }

    override fun setViewPager(categories: List<String>) {
        vp_list.adapter = ListPagerAdapter(supportFragmentManager, categories)
        tl_list_tab.setupWithViewPager(vp_list)
    }
}
