package com.example.seamanz.androidxdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_open_basic_actvity.setOnClickListener {
            Intent(this@MainActivity, BasicDemoActivity::class.java).run {
                startActivity(this)
            }
        }

        btn_bottom_navigation_activity.setOnClickListener {
            Intent(this@MainActivity, BottomNavigationDemoActivity::class.java).run {
                startActivity(this)
            }
        }
    }
}
