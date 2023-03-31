package com.example.forsa.MidFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.forsa.Adapters.IndChatAdapter
import com.example.forsa.Models.IndChatModel
import com.example.forsa.R
import com.example.forsa.databinding.FragmentIndChatPreOrderBinding

class IndChatPreOrder : Fragment() {

    private lateinit var binding: FragmentIndChatPreOrderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIndChatPreOrderBinding.inflate(inflater, container, false)
        individualChatListShow()
        return binding.root
    }

    private fun individualChatListShow() {
        val recyclerView = binding.preorderRecycler
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        // Sample data for IndChatModel
        val indChatData = listOf(
            IndChatModel(
                "10/03/2022", "12:30 pm", "Hello, how are you?", R.drawable.chatsendimg_shoes,
                R.drawable.shoe_img, "12:32 pm", "I'm fine, thank you."
            ),
            IndChatModel(
                "10/03/2022", "12:33 pm", "What are you doing?", R.drawable.shoe_img,
                R.drawable.shoe_img, "12:35 pm", "Nothing much, just watching TV."
            ),
            IndChatModel(
                "11/03/2022", "10:00 am", "Are you free this weekend?", R.drawable.shoe_img,
                R.drawable.shoe_img, "10:05 am", "Yes, why do you ask?"
            ),
            IndChatModel(
                "11/03/2022", "10:10 am", "Do you want to go out for lunch?", R.drawable.chatsendimg_shoesii,
                R.drawable.shoe_img, "10:15 am", "Sure, that sounds great!"
            )
        )

        val adapter = IndChatAdapter(indChatData)
        recyclerView.adapter = adapter
    }
}


