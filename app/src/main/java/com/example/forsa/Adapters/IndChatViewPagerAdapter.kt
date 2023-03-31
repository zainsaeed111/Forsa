package com.example.forsa.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.forsa.MidFragments.IndChatPreOrder
import com.example.forsa.MidFragments.IndOrderChat

class IndChatViewPagerAdapter(list:ArrayList<Fragment>, fm: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fm,lifecycle) {
    val fragmentList=list;
    override fun getItemCount(): Int {

        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        if (position==0)
            IndOrderChat()

        else
            IndChatPreOrder()

        return fragmentList[position]
    }
    }

