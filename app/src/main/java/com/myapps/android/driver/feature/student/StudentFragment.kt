package com.myapps.android.driver.feature.student

import android.os.Bundle
import android.util.Log
//import android.support.v4.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.myapps.android.driver.R
import com.myapps.android.driver.data.StudentItem
import com.myapps.android.driver.databinding.StudentFragmentBinding
import kotlinx.android.synthetic.main.student_fragment.*


class StudentFragment : Fragment(R.layout.student_fragment), StudentAdapter.OnItemClickListener {

    private  lateinit var binding: StudentFragmentBinding

    private lateinit var viewModelFactory: StudentViewModelFactory
    private lateinit var viewModel: StudentViewModel

    private lateinit var studentList: List<StudentItem>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("StudentFragment", "Called ViewModelProviders.of")

        //provide this with vmfactory
        viewModelFactory = StudentViewModelFactory(5)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(StudentViewModel::class.java)


        //How can i incorporate viewmodel with this data?

        studentList = generateDummyList(200)

        val adapter =
            StudentAdapter(studentList, this)
        students_list.adapter = adapter


        //student_list.layoutManager = LinearLayoutManager(context)




    }

    override fun onItemClick(position: Int) {
        Toast.makeText(context,"Item $position clicked", Toast.LENGTH_SHORT).show()
    }

    private fun generateDummyList(size : Int) : List<StudentItem> {

        val list = ArrayList<StudentItem>()

        for(i in 0 until size) {
            val item = StudentItem("Item $i")
            list += item
        }

        return list
    }

}