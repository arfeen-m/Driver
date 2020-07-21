package com.myapps.android.driver.feature.student

import android.util.Log
import androidx.lifecycle.ViewModel
import com.myapps.android.driver.data.StudentItem
import com.myapps.android.driver.repository.StudentRepository

class StudentViewModel(numberOfStudents: Int) : ViewModel() {

    private val studentRepository = StudentRepository()
    var studentList: List<StudentItem>

    var students = numberOfStudents



    init {
        Log.i("StudentViewModel", "StudentViewModel created !")
        studentList = studentRepository.generateDummyList(students)
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("StudentViewModel", "StudentViewModel destroyed!")
    }
}