package com.example.launchmode

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val textView = findViewById<TextView>(R.id.textView)
        val openGallery = findViewById<Button>(R.id.openGallery)

        val taskID = this.taskId
        "Task id: $taskID\n Activity Id : $this".also { textView.text = it }

        Log.d("LaunchMode", "FirstActivity TaskID: ${this.taskId}")
        Log.d("LaunchMode", "FirstActivity ID: $$this")

        openGallery.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.type = "image/*"
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK // like launchMode="singleTask"
            startActivity(intent)
        }

    }
}