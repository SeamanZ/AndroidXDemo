package com.example.seamanz.androidxdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.seamanz.androidxdemo.ui.vm.VmFragment

class VMActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vm_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, VmFragment.newInstance())
                .commitNow()
        }
    }

}
