
package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onSubmit(view: View) {

        val txtAge = findViewById<TextView>(R.id.txtViewAge);
        val inputYear = findViewById<EditText>(R.id.txtYear);

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        txtAge.text= ((currentYear - inputYear.text.toString().toInt()).toString())
    }

}