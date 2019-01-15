package com.app.pallavijoshi.tictactoe.presenter

interface MainActivityPresenter {

    fun createBoard()

    fun onCellClicked(row: Int, col: Int)

    interface View {}
}
