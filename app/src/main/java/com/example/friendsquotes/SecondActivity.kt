package com.example.friendsquotes

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Quotes lists
        val friendsQuotes = listOf(
            "We were on a break! - Ross",
            "How you doin'? - Joey",
            "PIVOT! PIVOT! PIVOT! - Ross",
            "Oh. My. God! - Janice",
            "Could I BE any more...? - Chandler",
            "Smelly cat, smelly cat, what are they feeding you? - Phoebe",
            "I'm not great at the advice. Can I interest you in a sarcastic comment? - Chandler",
            "Welcome to the real world. It sucks. You're gonna love it. - Monica",
            "It's a moo point. It's like a cow's opinion, it doesn't matter. - Joey",
            "I'm Chandler. I make jokes when I'm uncomfortable. - Chandler",
            "She's your lobster! - Phoebe",
            "I don't even have a 'pla'. - Phoebe",
            "Joey doesn't share food! - Joey ",
            "I'm hopeless and awkward and desperate for love! - Chandler",
            "No uterus, no opinion! - Rachel",
            "It's like all of my life everyone's told me, 'You're a shoe!' - Rachel",
            "That's right, I stepped up! She's my friend and she needed help. - Joey",
            "Welcome to an adult relationship! - Monica",
            "But they don't know that we know they know we know! - Phoebe",
            "I'm a gym member. I try to go four times a week... - Chandler"
        )

        // Select a random quote
        val randomQuote = friendsQuotes.random()

        // Show the quote on the screen
        val tvFrase = findViewById<TextView>(R.id.tvFrase)
        tvFrase.text = randomQuote

        // Button to go back to MainActivity
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}