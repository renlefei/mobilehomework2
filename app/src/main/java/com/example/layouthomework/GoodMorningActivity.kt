package com.example.layouthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_good_morning.*

class GoodMorningActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_good_morning)

        hello_good_morning.setOnClickListener {
            val intent = Intent()
            intent.putExtra("MESSAGE", "Message code 2000 from GoodMoring!")
            setResult(2000, intent)
            finish()
        }
    }
}
