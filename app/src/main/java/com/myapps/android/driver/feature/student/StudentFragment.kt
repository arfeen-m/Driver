package com.myapps.android.driver.feature.student

import android.os.Bundle
import android.util.Log
//import android.support.v4.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.myapps.android.driver.R
import kotlinx.android.synthetic.main.student_fragment.*
import javax.inject.Inject


class StudentFragment : Fragment(R.layout.student_fragment), StudentAdapter.OnItemClickListener {

    private lateinit var viewModelFactory: StudentViewModelFactory
    @Inject
    lateinit var viewModel: StudentViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("StudentFragment", "Called ViewModelProviders.of")

        viewModelFactory = StudentViewModelFactory(5)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(StudentViewModel::class.java)


        val adapter =
            StudentAdapter(viewModel.studentList, this)
        students_list.adapter = adapter

    }

    override fun onItemClick(position: Int) {
        Toast.makeText(context,"Item $position clicked", Toast.LENGTH_SHORT).show()
        this.findNavController().navigate(StudentFragmentDirections.actionStudentFragmentToStudentDetailFragment())
    }



}