package com.example.tp3mvp.mvp.presenter

import android.widget.EditText
import com.example.tp3mvp.mvp.contract.MainContract

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    init {
        view.onButtonPressed { onButtonPressed() }
    }

    override fun onButtonPressed(text: String) {
        view.showToast(text)
    }
}
