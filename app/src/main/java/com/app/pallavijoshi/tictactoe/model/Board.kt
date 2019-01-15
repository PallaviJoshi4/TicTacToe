package com.app.pallavijoshi.tictactoe.model

class Board {

    private val cells = Array<Array<Cell?>>(3) { arrayOfNulls(3) }
    private var currentPlayer: Player? = null
    private var winningPlayer: Player? = null
    private var state: State? = null

    /**
     * Setup a new game
     */

    init {
        clearCells()
        winningPlayer = null
        currentPlayer = Player.X
        state = State.IN_PROGRESS
    }

    /**
     * Assigns each cell with a new instance
     */
    private fun clearCells() {
        for (i in 0..2) {
            for (j in 0..2) {
                cells[i][j] = Cell()
            }
        }
    }

    private enum class State { IN_PROGRESS, FINISHED }

}
