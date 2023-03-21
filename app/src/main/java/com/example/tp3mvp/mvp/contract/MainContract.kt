package com.example.tp3mvp.mvp.contract

interface MainContract {
    interface View {
        fun showToast(text: () -> Unit)
        fun onClick()
    }
    interface Presenter {
        fun onButtonPressed(text: () -> Unit)
    }
}
