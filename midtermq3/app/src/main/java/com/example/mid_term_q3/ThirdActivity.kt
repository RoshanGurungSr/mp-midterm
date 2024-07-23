package com.example.mid_term_q3

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val button: Button = findViewById(R.id.btn21)
        val recommendation: TextView = findViewById(R.id.textView21)

        var flag: String = "Default"
        val spinnerVal : Spinner = findViewById(R.id.spinner21)
        var options = arrayOf("Happy", "Sad", "Romantic", "Party")
        spinnerVal.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
            options)

        button.setOnClickListener { view ->
            val x1: String = "1.Happy \n2.Can't Stop the Feeling! \n3.Dont Worry Be Happy " +
                    "\n4.Dancing Queen \n5.A Beuatiful Morning \n6.Oh Happy Day";
            val x2: String = "1.Lonely \n2.A Thousand Years \n3.Somebody Else \n4.Stone Cold \n5.Let me Down" +
                    "Slowly \n6.Save Your Tears";
            val x3: String = "1.Perfect \n2.I will always Love You \n3.My Heart Will Go On \n4.Time After Time" +
                    "\n5.Endless Love \nAll my life";
            val x4: String = "1.Hips Don't Lie \n2.Dance Again \n3.Uptown Funk \n4.I'm Coming Out \n5.Beat It" +
                    "\n6.Shut Up and Dance \n7.Get Lucky";

            when (flag) {
                "Happy" -> {
                    recommendation.text = x1;
                }
                "Sad" -> {
                    recommendation.text = x2;
                }
                "Romantic" -> {
                    recommendation.text = x3;
                }
                "Party" -> {
                    recommendation.text = x4;
                }
            }

        }

        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }
}
