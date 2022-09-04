package com.dag.odev2fmss

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
    }

    fun backButton2(view: View) {
       val intent = Intent(this,LoginActivity::class.java)
       startActivity(intent)
    }
}