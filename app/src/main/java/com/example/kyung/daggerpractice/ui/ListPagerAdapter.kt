package com.example.kyung.daggerpractice.ui

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ListPagerAdapter constructor(
        fm: FragmentManager,
        val categories: List<String>
) : FragmentPagerAdapter(fm) {

    override fun getItem(p0: Int): Fragment {
        return MoviesFragment.newInstance(categories[p0])
    }

    override fun getCount(): Int {
        return categories.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return categories[position]
    }
}