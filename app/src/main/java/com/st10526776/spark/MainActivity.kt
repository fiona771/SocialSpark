package com.st10526776.spark

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTimeOfDay = findViewById<EditText>(R.id.etTimeOfDay)
        val btnGetSpark = findViewById<Button>(R.id.btnGetSpark)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val tvSuggestion = findViewById<TextView>(R.id.tvSuggestion)

        btnGetSpark.setOnClickListener {
            val input = etTimeOfDay.text.toString().trim().lowercase()
            Log.d("SocialSpark", "User entered: $input")

            when (input) {
                "morning" -> tvSuggestion.text = "Send a Good Morning text to a family member!"
                "mid-morning" -> tvSuggestion.text = "Reach out to a colleague with a Thank You!"
                "afternoon" -> tvSuggestion.text = "Share a funny meme with a friend!"
                "afternoon snack time" -> tvSuggestion.text = "Send a thinking of you message!"
                "dinner" -> tvSuggestion.text = "Call a friend for a 5 minute catch up!"
                "after dinner", "night" -> tvSuggestion.text = "Leave a comment on a friends post!"
                else -> tvSuggestion.text = "Please enter a valid time of day!"
            }
        }

        btnReset.setOnClickListener {
            etTimeOfDay.text.clear()
            tvSuggestion.text = "Your suggestion will appear here."
            Log.d("SocialSpark", "App reset")
        }
    }
}