package com.myapps.android.driver.repository

import com.myapps.android.driver.data.StudentItem

class StudentRepository {

    fun generateDummyList(size : Int) : List<StudentItem> {

        val list = ArrayList<StudentItem>()

        for(i in 1..size) {
            val item = StudentItem("Item $i")
            list += item
        }

        return list
    }
}