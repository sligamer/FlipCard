package com.a4.lab3.sligamer.flipcard

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

/**
 * Created by Justin Freres on 2/21/2018.
 * Model for Answer Activity
 * Lab 3-4 Transitions Application
 * Plugin Support with kotlin_version = '1.2.21'
 */
class AnswerActivity  : AppCompatActivity() {

    // DECLARE VARIABLES
    private lateinit var questionBtn: Button

    // OVERRIDE ONCREATE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        questionBtn = findViewById(R.id.backToQuestionBtn)

        questionBtn.setOnClickListener {
            val showQuestionActivity = Intent(this, QuestionActivity::class.java)
            startActivity(showQuestionActivity)
        }
    }

    // OVERRIDE ONSTART
    override fun onStart() {
        super.onStart()
        // OVERRIDE PENDING TRANSITION
        overridePendingTransition(R.anim.answer_out, R.anim.question_in)
    }
}