package com.app.pallavijoshi.tictactoe.presenter

import com.app.pallavijoshi.tictactoe.model.Board

class MainActivityPresenterImpl(val view: MainActivityPresenter.View) : MainActivityPresenter {

    lateinit var board: Board

    override fun createBoard() {
        board = Board()
    }

    override fun onCellClicked(row: Int, col: Int) {
        // TODO
    }
}
