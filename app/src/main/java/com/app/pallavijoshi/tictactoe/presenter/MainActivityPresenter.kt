package com.app.pallavijoshi.tictactoe.presenter

interface MainActivityPresenter {

    fun onCellClicked(row: Int, col: Int)

    fun reset()

    interface View {

        fun setCellText(row: Int, col: Int, player: String)

        fun showWinnerDialog(player: String)

    }
}
