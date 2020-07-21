package com.myapps.android.driver.feature.student

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class StudentViewModelFactory(private val numberOfStudents: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(StudentViewModel::class.java)) {
            return StudentViewModel(numberOfStudents) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}