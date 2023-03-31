package com.example.forsa.MidFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.forsa.Adapters.IndChatViewPagerAdapter
import com.example.forsa.databinding.FragmentIndvidualChatBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class IndvidualChat : Fragment() {

    private lateinit var binding: FragmentIndvidualChatBinding
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPagerAdapter: IndChatViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIndvidualChatBinding.inflate(inflater, container, false)
        viewPager = binding.indvidualChatViewPager
        tabLayout = binding.userTab
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.hide()
        val fragmentList = arrayListOf(IndChatPreOrder(), IndOrderChat())
        viewPagerAdapter = IndChatViewPagerAdapter(fragmentList, childFragmentManager, lifecycle)
        viewPager.adapter = viewPagerAdapter

        // Set up the Tab Layout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Order Chat"
                1 -> tab.text = "Pre Order"
            }
        }.attach()

        // Set up the Tab Layout click listener
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab?.position ?: 0
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }
}