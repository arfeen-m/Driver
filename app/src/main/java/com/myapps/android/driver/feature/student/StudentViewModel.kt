package com.myapps.android.driver.feature.student

import android.util.Log
import androidx.lifecycle.ViewModel

class StudentViewModel(numberOfStudents: Int) : ViewModel() {


    //private lateinit var studentList: MutableList<String>
//    private lateinit var studentList: List<StudentItem>
//
//    private fun generateDummyList(size : Int) : List<StudentItem> {
//
//        val list = ArrayList<StudentItem>()
//
//        for(i in 0 until size) {
//            val item = StudentItem("Item $i")
//            list += item
//        }
//
//        return list
//    }

    var students = numberOfStudents

    init {
        Log.i("StudentViewModel", "StudentViewModel created !")
        //setList()
        //studentList = generateDummyList(200)
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("StudentViewModel", "StudentViewModel destroyed!")
    }

//    private fun setList() {
//        studentList = mutableListOf(
//            "John",
//            "Abe",
//            "Tom",
//            "Kent",
//            "Cristiano",
//            "Messi",
//            "Neymar",
//            "Bale",
//            "Suarez"
//        )
//    }



}