package com.example.mid_term_q3
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val editText1: EditText = findViewById(R.id.edNum1)
        val editText2: EditText = findViewById(R.id.edNum2)
        val result: TextView = findViewById(R.id.result)
        val button: Button = findViewById(R.id.btn1)

        var flag: String = "sum"
        val spinnerVal: Spinner = findViewById(R.id.spinnerV)
        var options = arrayOf("sum", "subtract", "multiply", "division")

        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        button.setOnClickListener{ view ->
            var x: Int = editText1.text.toString().toInt();
            var y: Int = editText2.text.toString().toInt();


            // Using when for conditional statement
            when (flag){
                "sum" -> {
                    result.text = sum(x,y).toString()
                }
                "subtract" -> {
                    result.text = subtract(x,y).toString();
                }
                "multiply" -> {
                    result.text = multiply(x,y).toString();
                }
                "division" -> {
                    try {
                        result.text = division(x,y).toString();
                    }
                    catch (e: Exception){
                        result.text = "Error"
                    }
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

public fun sum(a: Int, b: Int): Int {
    return a + b
}

public fun subtract(a: Int, b: Int): Int {
    return a - b
}

public fun multiply(a: Int, b: Int): Int {
    return a * b
}

public fun division(a: Int, b: Int): Int {
    return a / b
}