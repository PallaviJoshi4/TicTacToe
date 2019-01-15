package com.app.pallavijoshi.tictactoe.presenter

import com.app.pallavijoshi.tictactoe.model.Board

class MainActivityPresenterImpl(val view: MainActivityPresenter.View) : MainActivityPresenter {

    private val board by lazy { Board() }

    override fun onCellClicked(row: Int, col: Int) {
        val player = board.setPlayer(row, col)

        if (player != null) {
            view.setCellText(row, col, player.toString())
        }

        if (board.winningPlayer != null) {
            view.showWinnerDialog(player.toString())
        }
    }

    override fun reset() {
        board.clear()
        for (i in 0..2) {
            for (j in 0..2) {
                view.setCellText(i, j, "")
            }
        }
    }
}
