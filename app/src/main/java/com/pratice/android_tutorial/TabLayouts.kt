package com.pratice.android_tutorial

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.pratice.android_tutorial.adapter.ViewPagerAdapter
import com.pratice.android_tutorial.fragment.Tab1
import com.pratice.android_tutorial.fragment.Tab2
import com.pratice.android_tutorial.fragment.Tab3

class TabLayouts : AppCompatActivity() {
    private lateinit var pager: ViewPager // creating object of ViewPager
    private lateinit var tab: TabLayout  // creating object of TabLayout
    private lateinit var bar: Toolbar    // creating object of ToolBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tab_layouts)
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)
        bar = findViewById(R.id.toolbar)
        setSupportActionBar(bar)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Tab1(),"Tab1")
        adapter.addFragment(Tab2(),"Tab2")
        adapter.addFragment(Tab3(),"Tab3")

        pager.adapter = adapter
        tab.setupWithViewPager(pager)

    }
}