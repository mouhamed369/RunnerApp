package com.example.runner.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

import com.example.runner.R

class EditprofileActivity : AppCompatActivity() {
    private lateinit var imageView25: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)
        imageView25 = findViewById(R.id.imageView25)
        imageView25.setOnClickListener {
            finish()
        }

    }}