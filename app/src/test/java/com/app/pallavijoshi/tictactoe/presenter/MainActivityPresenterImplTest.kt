package com.app.pallavijoshi.tictactoe.presenter

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.api.easymock.PowerMock
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
class MainActivityPresenterImplTest {

    lateinit var presenter: MainActivityPresenter
    lateinit var view: MainActivityPresenter.View

    @Before
    fun setUp() {
        view = PowerMock.createMock(MainActivityPresenter.View::class.java)
        presenter = MainActivityPresenterImpl(view)
    }

    @After
    fun tearDown() {
        PowerMock.verifyAll()
        PowerMock.resetAll()
    }

    @Test
    fun onCellClicked() {
        val row = 2
        val col = 2

        PowerMock.replayAll()

        presenter.onCellClicked(row, col)
    }
}
