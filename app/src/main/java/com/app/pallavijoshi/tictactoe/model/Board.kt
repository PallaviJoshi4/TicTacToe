package com.app.pallavijoshi.tictactoe.model

class Board {

    private val cells = Array<Array<Cell?>>(3) { arrayOfNulls(3) }
    private var currentPlayer: Player? = null
    private var state: State? = null

    /**
     * Setup a new game
     */

    init {
        clearCells()
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

    /**
     * Set the current player's move.
     * If the game is over
     *
     * @param row 0..2
     * @param col 0..2
     * @return the player that moved or null if we did not move anything.
     */
    fun setPlayer(row: Int, col: Int): Player? {

        var player: Player? = null

        if (isValid(row, col)) {
            cells[row][col]?.value = currentPlayer
            player = currentPlayer

            // change the current player and continue
            changePlayer()

        }

        return player
    }

    private fun changePlayer() {
        currentPlayer = if (currentPlayer === Player.X) Player.O else Player.X
    }

    private fun isValid(row: Int, col: Int) =
        state != State.FINISHED && isCorrectRowOrColumn(row, col) && cells[row][col]?.value == null

    private fun isCorrectRowOrColumn(row: Int, col: Int) = row in 0..2 && col in 0..2

}
