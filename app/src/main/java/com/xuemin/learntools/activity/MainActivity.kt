package com.xuemin.learntools.activity

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xuemin.learntools.R
import com.xuemin.learntools.adapter.MainRecyclerViewAdapter
import com.xuemin.learntools.model.MainDataProvider
import com.xuemin.learntools.model.bean.MainData

class MainActivity : AppCompatActivity() {

    private var fragmentContainer: FrameLayout? = null
    private var recyclerView: RecyclerView? = null
    private var adapter: MainRecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initData()
    }

    private fun initData() {
        val data = MainDataProvider.getData()
        adapter?.data = data
        adapter?.notifyDataSetChanged()
    }

    private fun initView() {
        recyclerView = findViewById<RecyclerView>(R.id.recycler_view_list)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        adapter = MainRecyclerViewAdapter(this)
        recyclerView?.adapter = adapter
        fragmentContainer =  findViewById<FrameLayout>(R.id.fragment_container)
    }

    fun switchComponent(data: MainData) {
       data.fragment?.let {
            val transaction = supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, data.fragment!!)
            transaction.commit()
           return
        }
        data.activityNameString?.let {
            val intent = Intent()
            intent.component = ComponentName(this@MainActivity, data.activityNameString!!)
            startActivity(intent)
       }
    }
}
