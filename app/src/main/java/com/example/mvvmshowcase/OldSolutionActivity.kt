package com.example.mvvmshowcase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class OldSolutionActivity : AppCompatActivity() {

    lateinit var txtTry: TextView
    lateinit var txtResult: TextView
    lateinit var edtGuess: EditText
    lateinit var btnGuess: Button
    var myNumber: Int = 5
    var numberOfTry = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_old_solution)

        init()
        listeners()

    }

    private fun init() {
        txtTry = findViewById(R.id.txtTry)
        txtResult = findViewById(R.id.txtResult)
        edtGuess = findViewById(R.id.edtGuess)
        btnGuess = findViewById(R.id.btnGuess)
    }

    private fun listeners() {

        btnGuess.setOnClickListener {
            val result = edtGuess.text.toString()

            if (result.isNotEmpty()) {
                increaseScore()
                checkGuess(result.toInt())
            }
        }
    }

    private fun increaseScore() {
        ++numberOfTry
        txtTry.text = "Deneme: $numberOfTry"
    }

    private fun checkGuess(userGuess: Int) {
        if (userGuess == myNumber) {
            txtResult.text = "Bildin"
        } else if (userGuess > myNumber) {
            txtResult.text = "Daha küçük bir sayı girin"
        } else {
            txtResult.text = "Daha yüksek bir sayı girin"
        }
    }
}