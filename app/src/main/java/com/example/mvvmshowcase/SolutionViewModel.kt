package com.example.mvvmshowcase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SolutionViewModel : ViewModel() {


    private var _currentScore = MutableLiveData<String>()
    val currentScore: LiveData<String> get() = _currentScore

    private var _result = MutableLiveData<String>()
    val result: LiveData<String> get() = _result

    var myScore = 0
    var randomNumber = 5
    var guessResult: String = ""

    private fun increaseScore() {
        ++myScore
        _currentScore.value = "Deneme: $myScore"
    }

    private fun checkGuess(userGuess: Int) {

        _result.value = if (userGuess == randomNumber) {
            "Bildin"
        } else if (userGuess > randomNumber) {
            "Daha küçük bir sayı girin"
        } else {
            "Daha yüksek bir sayı girin"
        }

    }

    fun guessClicked() {
        Log.d("TAG", "GuessClicked")
        increaseScore()
        checkGuess(guessResult.toInt())
    }

    fun guessChanged(s: CharSequence) {
        Log.d("CurrentText", s.toString())
        guessResult = s.toString()
    }





}