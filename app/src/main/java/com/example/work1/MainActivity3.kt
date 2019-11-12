package com.example.work1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_page3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        setTitle("Page3")
        var name1 = intent.extras?.getString(MainActivity2().TAG_NAME_1)
        name1_text.text = name1
    }
}