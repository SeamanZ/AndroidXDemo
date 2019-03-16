package com.example.seamanz.androidxdemo.ui.vm

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

class AppViewModel(
    context: Application
) : AndroidViewModel(context) {

    override fun onCleared() {
        super.onCleared()
        Log.v("AppViewModel", "AppViewModel-------->onCleared " + this.hashCode())
    }
}