package com.example.tp3mvp.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.tp3mvp.databinding.ActivityMainBinding
import com.example.tp3mvp.mvp.contract.MainContract

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun showToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    override fun onButtonPressed(onClick: () -> Unit) {
        binding.toastButton.setOnClickListener { onClick() }
    }

    override fun getText() = binding.editTextUser.text.toString()
}
