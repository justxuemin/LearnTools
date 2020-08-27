package com.xuemin.learntools.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xuemin.learntools.R
import com.xuemin.learntools.fragments.FlipClockFragment

class FlipClockActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flip_clock)

        val fragmentTransaction =
            supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.flip_clock_container, FlipClockFragment.newInstance())
        fragmentTransaction.commit()
    }
}