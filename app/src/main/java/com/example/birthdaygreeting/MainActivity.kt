package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generateGreeting(view: View) {
        val nameOfPerson = HintBox.editableText.toString()

        val intent = Intent(this, BirthdayGreeting::class.java)
        intent.putExtra(BirthdayGreeting.NAME_EXTRA, nameOfPerson)
        startActivity(intent)
    }
}