package com.xuemin.learntools.model

import com.xuemin.learntools.R
import com.xuemin.learntools.fragments.FlipClockFragment
import com.xuemin.learntools.model.bean.MainData

object MainDataProvider {
    fun getData() : List<MainData> {
        val arrayList = arrayListOf<MainData>()
        arrayList.add(MainData(R.string.flipclock, "com.xuemin.learntools.activity.FlipClockActivity"))
        return arrayList
    }
}