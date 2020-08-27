package com.xuemin.learntools.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xuemin.learntools.R

class MainViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
    var name : TextView? = null

    init {
        name = itemView.findViewById<TextView>(R.id.function_name)
    }
}