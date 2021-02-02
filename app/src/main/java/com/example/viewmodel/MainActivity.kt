    package com.example.viewmodel
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ViewSwitcher
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.tv)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        textView.text=viewModel.number.toString()

        button.setOnClickListener {
            viewModel.addNumber()
            textView.text = viewModel.number.toString()
        }
    }}



