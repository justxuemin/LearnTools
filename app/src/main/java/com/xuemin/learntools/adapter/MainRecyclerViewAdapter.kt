package com.xuemin.learntools.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.xuemin.learntools.R
import com.xuemin.learntools.activity.MainActivity
import com.xuemin.learntools.model.bean.MainData
import com.xuemin.learntools.viewholder.MainViewHolder

class MainRecyclerViewAdapter(mainActivity : MainActivity): RecyclerView.Adapter<MainViewHolder>() {

    var data : List<MainData> = listOf()
    private var activity : MainActivity = mainActivity

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler_view_main, parent, false)
        return MainViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.name?.setText(data[position].nameResId)
        holder.itemView.setOnClickListener(View.OnClickListener {
            activity.switchComponent(data[position])
        })
    }
}
