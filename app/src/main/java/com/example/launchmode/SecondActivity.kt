package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.textView)
        val firstBtn = findViewById<Button>(R.id.startThirdActivityButton)

        val taskID = this.taskId
        "Task id: $taskID\n Activity Id : $this".also { textView.text = it }

        Log.d("LaunchMode", "SecondActivity TaskID: $taskID")
        Log.d("LaunchMode", "SecondActivity ID: $$this")

        firstBtn.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, intent?.getStringExtra("name"), Toast.LENGTH_SHORT).show()
    }

}