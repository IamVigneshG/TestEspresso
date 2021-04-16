package com.gv.testespresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bt = findViewById<Button>(R.id.uibutton)
        bt.setOnClickListener {
            Toast.makeText(this,"Hey youuuuuu",Toast.LENGTH_LONG).show()

        }
    }
}