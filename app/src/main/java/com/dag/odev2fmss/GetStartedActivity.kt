package com.dag.odev2fmss

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dag.odev2fmss.databinding.ActivityGetstartedBinding

class GetStartedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGetstartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetstartedBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}