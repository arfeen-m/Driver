package com.myapps.android.driver.feature.student.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myapps.android.driver.R
import kotlinx.android.synthetic.main.student_detail_fragment.*


class StudentDetailFragment : Fragment(R.layout.student_detail_fragment) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        student_detail.text = "TEST"
    }

}