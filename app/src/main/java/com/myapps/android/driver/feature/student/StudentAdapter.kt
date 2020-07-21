package com.myapps.android.driver.feature.student

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.myapps.android.driver.R
import com.myapps.android.driver.data.StudentItem
import kotlinx.android.synthetic.main.text_item_view.view.*

class StudentDiffCallBack: DiffUtil.ItemCallback<StudentItem>() {
    override fun areItemsTheSame(oldItem: StudentItem, newItem: StudentItem): Boolean {
        return oldItem.text == newItem.text
    }

    override fun areContentsTheSame(oldItem: StudentItem, newItem: StudentItem): Boolean {
        return oldItem == newItem
    }

}

class StudentAdapter(
    private val studentList: List<StudentItem>,
    private val listener: OnItemClickListener
) :
    ListAdapter<StudentItem, StudentAdapter.StudentViewHolder>(StudentDiffCallBack()) {

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

        val itemView = LayoutInflater.from(parent.context).inflate(
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