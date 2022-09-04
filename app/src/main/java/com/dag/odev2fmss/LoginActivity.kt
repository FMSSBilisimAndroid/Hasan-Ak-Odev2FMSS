package com.dag.odev2fmss

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun backButton1(view: View) {
        val intent = Intent(this@LoginActivity, GetStartedActivity::class.java)
        startActivity(intent)
    }

    fun newAccount(view: View) {
        val intent = Intent(this@LoginActivity, CreateActivity::class.java)
        startActivity(intent)
    }
}