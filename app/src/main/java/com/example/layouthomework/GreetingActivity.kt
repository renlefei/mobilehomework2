package com.example.layouthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_greeting.*

class GreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        hello_world.setOnClickListener {
            val intent = Intent(this, GoodMorningActivity::class.java)
            startActivityForResult(intent, 1000)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1000) {
            if (resultCode == 2000) {
                result_code.visibility = View.VISIBLE
                result_code.text = data?.getStringExtra("MESSAGE")
            }
        }
    }
}
