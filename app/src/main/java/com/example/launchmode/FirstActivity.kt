package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val textView = findViewById<TextView>(R.id.textView)
        val firstBtn = findViewById<Button>(R.id.startFirstActivityButton)
        val secondBtn = findViewById<Button>(R.id.startSecondActivityButton)

        val taskID = this.taskId
        "Task id: $taskID\n Activity Id : $this".also { textView.text = it }

        Log.d("LaunchMode", "FirstActivity TaskID: $taskID")
        Log.d("LaunchMode", "FirstActivity ID: $$this")

        firstBtn.setOnClickListener {
            startActivity(Intent(this, this::class.java))
        }

        secondBtn.setOnClickListener {
            val i = (Intent(this, SecondActivity::class.java))
            i.putExtra("name", "this is from first activity")
            startActivity(i)
        }
    }
}