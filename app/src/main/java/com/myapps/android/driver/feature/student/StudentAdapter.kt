package com.myapps.android.driver.feature.student

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.myapps.android.driver.R
import com.myapps.android.driver.data.StudentItem
import kotlinx.android.synthetic.main.text_item_view.view.*

class StudentAdapter(
    private val studentList: List<StudentItem>,
    private val listener: OnItemClickListener
) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    inner class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        val textView: TextView = itemView.student_name

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            listener.onItemClick(position)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {

        var itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.text_item_view,
            parent, false
        )

        return StudentViewHolder(
            itemView
        )
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val currentItem = studentList[position]
        holder.textView.text = currentItem.text
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

}

//class StudentListener() {
//    fun onClick() {
//
//    }
//}

//class StudentAdapter : RecyclerView.Adapter<TextItemViewHolder>() {
//
//
//    //private lateinit var data: MutableList<String>
//
//    private var data = mutableListOf(  "John",
//        "Abe",
//        "Tom",
//        "Kent",
//        "Cristiano",
//        "Messi",
//        "Neymar",
//        "Bale",
//        "Suarez"
//    )
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        val view = layoutInflater
//            .inflate(R.layout.text_item_view, parent, false) as TextView
//        return TextItemViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return data.size
//    }
//
//    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
//        val item = data
//    }
//}