package com.example.asystentnauczyciela.select

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class SelectViewModelFactory(private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SelectViewModel::class.java)) {
            return SelectViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class.")
    }
}