package com.mahtab.buttonclickapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    //private var userInput: EditText? = null
    //private var button: Button? = null
    private var textView: TextView? = null
    //private var numTimesClicked = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: called")
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById<EditText>(R.id.editText)
        val button: Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()
        userInput.setText("")


        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d(TAG, "onClick: called")
//numTimesClicked += 1
                textView?.append(userInput.text)
                textView?.append("\n")
                /*if (numTimesClicked != 1) {
                    textView?.append("s\n")
                } else {
                    textView?.append("\n")
                }*/
                //userInput.text.clear()
                userInput.setText("")
            }

        })
    }
}




















