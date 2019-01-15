package com.app.pallavijoshi.tictactoe.view

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.app.pallavijoshi.tictactoe.R
import com.app.pallavijoshi.tictactoe.presenter.MainActivityPresenter
import com.app.pallavijoshi.tictactoe.presenter.MainActivityPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityPresenter.View {

    lateinit var presenter: MainActivityPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenterImpl(this)
        reset.setOnClickListener { presenter.reset() }
    }

    fun onCellClicked(view: View) {
        presenter.onCellClicked(
            view.tag.toString().substring(0, 1).toInt(),
            view.tag.toString().substring(1, 2).toInt()
        )
    }

    override fun setCellText(row: Int, col: Int, player: String) {
        val cell : Button = grid_tictactoe.findViewWithTag("" + row + col)
        cell.text = player
    }

    override fun showWinnerDialog(player: String) {
        AlertDialog.Builder(this)
            .setMessage(resources.getString(R.string.winner) + " " + player)
            .setPositiveButton(resources.getString(R.string.ok)) { _, _ -> }
            .create()
            .show()
    }
}
