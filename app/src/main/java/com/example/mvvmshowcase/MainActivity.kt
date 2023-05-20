package com.example.mvvmshowcase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmshowcase.databinding.ActivityMainBinding
import com.example.mvvmshowcase.utils.dataBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by dataBinding(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listeners()
    }

    private fun listeners() {

        binding.btnOld.setOnClickListener {

            val intent = Intent(this, OldSolutionActivity::class.java)
            startActivity(intent)

        }

        binding.btnMvvm.setOnClickListener {

            val intent = Intent(this, MvvmSolutionActivity::class.java)
            startActivity(intent)

        }

    }
}