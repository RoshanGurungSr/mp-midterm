package com.example.mid_term_q3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnSendMsgToCalcActivity: Button = findViewById(R.id.buttonCalc)
        val btnSendMsgToRecommendActivity: Button = findViewById(R.id.buttonRecommend)

        btnSendMsgToCalcActivity.setOnClickListener {
            val message: String = "Roshan Gurung"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", message)
            startActivity(intent)
        }

        btnSendMsgToRecommendActivity.setOnClickListener {
            val message2: String = "Roshan Gurung"
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("key", message2)
            startActivity(intent)
        }
    }
}