package com.dag.odev2fmss

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dag.odev2fmss.databinding.ActivityGetstartedBinding

class GetStartedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGetstartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetstartedBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun joinNowClick(view: View) {
        val intent = Intent(this@GetStartedActivity, LoginActivity::class.java)
        startActivity(intent)
    }
}