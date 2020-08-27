package com.xuemin.learntools.model.bean

import androidx.annotation.StringRes
import androidx.fragment.app.Fragment

class MainData(@StringRes nameStringResId: Int) {

    var activityNameString: String? = null
    var fragment: Fragment? = null

    @StringRes var nameResId = nameStringResId

    constructor(@StringRes nameStringResId: Int, frag: Fragment) : this(nameStringResId) {
        fragment = frag
    }

    constructor(@StringRes nameStringResId: Int, activityString: String) : this(nameStringResId) {
        activityNameString = activityString
    }

}