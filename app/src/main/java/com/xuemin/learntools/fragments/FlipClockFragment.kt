package com.xuemin.learntools.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.xuemin.learntools.R

class FlipClockFragment: Fragment() {

    companion object {
        fun newInstance() = FlipClockFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_flip_clock, container, false)
    }
}