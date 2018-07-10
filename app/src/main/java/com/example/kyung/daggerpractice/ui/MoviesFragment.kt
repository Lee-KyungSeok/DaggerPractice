package com.example.kyung.daggerpractice.ui

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

import com.example.kyung.daggerpractice.R
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_movies.*
import javax.inject.Inject

class MoviesFragment: Fragment(), MoviesFragmentContract.View {

    @Inject lateinit var presenter: MoviesFragmentContract.Presenter

    companion object {
        @JvmStatic
        fun newInstance(category: String): MoviesFragment {

            val fragment = MoviesFragment()

            val bundle = Bundle()
            bundle.putString("category", category)
            fragment.arguments = bundle

            return fragment
        }
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter.loadMovies(arguments!!.getString("category"))
    }

    override fun setList(movies: List<String>) {
        val adapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, movies)
        lv_movies.adapter = adapter
    }

}
