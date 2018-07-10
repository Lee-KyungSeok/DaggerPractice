package com.example.kyung.daggerpractice.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.kyung.daggerpractice.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View, HasSupportFragmentInjector {

    @Inject lateinit var presenter: MainActivityContract.Presenter
    @Inject lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)

        presenter.loadCategory()
    }

    override fun setViewPager(categories: List<String>) {
        vp_list.adapter = ListPagerAdapter(supportFragmentManager, categories)
        tl_list_tab.setupWithViewPager(vp_list)
    }

    override fun supportFragmentInjector() : AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }


}
