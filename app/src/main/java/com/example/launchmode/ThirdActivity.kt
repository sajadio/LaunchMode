package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val textView = findViewById<TextView>(R.id.textView)
        val firstBtn = findViewById<Button>(R.id.startFirstActivityButton)

        val taskID = this.taskId
        "Task id: $taskID\n Activity Id : $this".also { textView.text = it }

        Log.d("LaunchMode", "ThirdActivity TaskID: $taskID")
        Log.d("LaunchMode", "ThirdActivity ID: $$this")

        firstBtn.setOnClickListener {
            startActivity(Intent(this, FourthActivity::class.java))
        }

    }
}