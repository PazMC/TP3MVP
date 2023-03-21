package com.example.tp3mvp.activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tp3mvp.mvp.presenter.MainPresenter
import com.example.tp3mvp.mvp.view.MainView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainPresenter(MainView(this))
    }
}
