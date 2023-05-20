package com.example.mvvmshowcase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.mvvmshowcase.databinding.ActivityMvvmSolutionBinding
import com.example.mvvmshowcase.utils.dataBinding

class MvvmSolutionActivity : AppCompatActivity() {

    private val solutionViewModel by viewModels<SolutionViewModel>()
    private val binding: ActivityMvvmSolutionBinding by dataBinding(R.layout.activity_mvvm_solution)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm_solution)

        binding.viewModel = solutionViewModel
        binding.lifecycleOwner = this

        binding.btnGuess
    }
}