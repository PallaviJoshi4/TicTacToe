package com.app.pallavijoshi.tictactoe.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.app.pallavijoshi.tictactoe.R
import com.app.pallavijoshi.tictactoe.presenter.MainActivityPresenter
import com.app.pallavijoshi.tictactoe.presenter.MainActivityPresenterImpl

class MainActivity : AppCompatActivity(), MainActivityPresenter.View {

    lateinit var presenter: MainActivityPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenterImpl(this)
        presenter.createBoard()
    }

    fun onCellClicked(view: View) {
      // TODO
    }
}
