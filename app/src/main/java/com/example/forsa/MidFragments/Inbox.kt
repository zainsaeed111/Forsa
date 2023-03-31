package com.example.forsa.MidFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.forsa.Adapters.InboxChatAdapter
import com.example.forsa.Models.InboxChatModel
import com.example.forsa.R
import com.example.forsa.databinding.FragmentInboxBinding


class Inbox : Fragment() {


    private lateinit var binding: FragmentInboxBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentInboxBinding.inflate(layoutInflater,container,false)
        InboxChatListShow()
        return binding.root
    }

    private fun InboxChatListShow() {

        val recyclerView = binding.inboxListrecycler
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

// Create a list of InboxChatModel items with different values
        val homeViewAllItems = ArrayList<InboxChatModel>()

        homeViewAllItems.add(InboxChatModel(R.drawable.chat_profile_img_one_active, "John", "Hi there!", "10:00 AM"))
        homeViewAllItems.add(InboxChatModel(R.drawable.chat_profile_img_two_inactive, "Jane", "Hello!", "11:00 AM"))
        homeViewAllItems.add(InboxChatModel(R.drawable.chat_profile_img_three_inactive, "Peter", "How are you?", "12:00 PM"))
        homeViewAllItems.add(InboxChatModel(R.drawable.chat_profile_img_four_active, "Mary", "Fine, thanks. And you?", "1:00 PM"))
        homeViewAllItems.add(InboxChatModel(R.drawable.chat_profile_img_five_active, "Ghulam ALi khan", "Fine, thanks. And you?", "2:00 PM"))
        homeViewAllItems.add(InboxChatModel(R.drawable.chat_profile_img_six_inactive, "Hammad Abid", "Fine, thanks. And you?", "2:00 PM"))
        homeViewAllItems.add(InboxChatModel(R.drawable.chat_profile_img_six_inactive, "Amin Akbar", "Its ok, thanks. And you?", "3:00 PM"))
        homeViewAllItems.add(InboxChatModel(R.drawable.chat_profile_img_seven_inactive, "Zain Saeed", "Its ok, thanks. And you?", "3:00 PM"))
        homeViewAllItems.add(InboxChatModel(R.drawable.chat_profile_img_eight_inactive, "Kashif", "Its ok, thanks. And you?", "11:00 PM"))
        val adapter = InboxChatAdapter(homeViewAllItems)
        recyclerView.adapter = adapter




    }


}