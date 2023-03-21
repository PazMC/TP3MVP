package com.example.tp3mvp

import com.example.tp3mvp.mvp.contract.MainContract
import com.example.tp3mvp.mvp.presenter.MainPresenter
import org.junit.Before

private lateinit var presenter: MainContract.Presenter

@MockK
private lateinit var view: MainContract

@Before
fun setup(){
    MockKAnnotations.init(this, relaxed = true)
    presenter = MainPresenter(view)
}

