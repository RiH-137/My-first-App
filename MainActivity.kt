package com.example.captrih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity2)


        val btnClickMe=findViewById<Button>(R.id.mybutton)
        val tvMyTextView= findViewById<TextView>(R.id.textView_change)
        var timesClicked=0

        btnClickMe.setOnClickListener{
            timesClicked+=1

            tvMyTextView.text=timesClicked.toString()
            //Toast.makeText(this, "hey Rishi, I am toast", Toast.LENGTH_LONG).show()
            Toast.makeText(this, "Hey you clicked the button...", Toast.LENGTH_LONG).show()

        }
    }
}
