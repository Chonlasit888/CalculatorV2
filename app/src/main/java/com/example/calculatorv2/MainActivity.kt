package com.example.calculatorv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clean.setOnClickListener {
            textView.setText("0")
        }
        seven.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "7")
            } else {
                textView.setText(textView.text.toString() + "7")
            }
        }
        eigth.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "8")
            } else {
                textView.setText(textView.text.toString() + "8")
            }
        }
        nine.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "9")
            } else {
                textView.setText(textView.text.toString() + "9")
            }
        }
        four.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "4")
            } else {
                textView.setText(textView.text.toString() + "4")
            }
        }
        five.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "5")
            } else {
                textView.setText(textView.text.toString() + "5")
            }
        }
        six.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "6")
            } else {
                textView.setText(textView.text.toString() + "6")
            }
        }
        one.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "1")
            } else {
                textView.setText(textView.text.toString() + "1")
            }
        }
        two.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "2")
            } else {
                textView.setText(textView.text.toString() + "2")
            }
        }
        three.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "3")
            } else {
                textView.setText(textView.text.toString() + "3")
            }
        }
        zero.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("0")
            } else {
                textView.setText(textView.text.toString() + "0")
            }
        }

    }
}