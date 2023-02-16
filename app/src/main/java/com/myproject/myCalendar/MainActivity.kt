package com.myproject.myCalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button=findViewById(R.id.button)

        button.setOnClickListener {
            button.text="GO"

            val app=Intent(this@MainActivity, secondActivity::class.java)
            startActivity(app)


        }


    }
}