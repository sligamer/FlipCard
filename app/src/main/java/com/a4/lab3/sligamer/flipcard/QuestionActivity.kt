package com.a4.lab3.sligamer.flipcard

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * Created by Justin Freres on 2/21/2018.
 * Model for Question Activity
 * Lab 3-4 Transitions Application
 * Plugin Support with kotlin_version = '1.2.21'
 */
class QuestionActivity : AppCompatActivity() {

    private lateinit var answerBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        answerBtn = findViewById(R.id.toAnswerBtn)

        answerBtn.setOnClickListener {
            val showAnswerActivity = Intent(this, AnswerActivity::class.java)
            startActivity(showAnswerActivity)
        }

    }
    override fun onStart() {
        super.onStart()
        overridePendingTransition(R.anim.question_out, R.anim.answer_in)
    }
}
