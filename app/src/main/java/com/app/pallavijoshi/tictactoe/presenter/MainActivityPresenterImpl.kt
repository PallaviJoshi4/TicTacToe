package com.app.pallavijoshi.tictactoe.presenter

import com.app.pallavijoshi.tictactoe.model.Board

class MainActivityPresenterImpl(val view: MainActivityPresenter.View) : MainActivityPresenter {

    override fun onCellClicked(row: Int, col: Int) {
        val board = Board()
        val player = board.setPlayer(row, col)

        if (player != null) {
            view.setCellText(row, col, player.toString())
        }
    }
}
