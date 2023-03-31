package com.example.forsa.Vendor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.forsa.Adapters.AlIitemsAdapter
import com.example.forsa.Adapters.InboxChatAdapter
import com.example.forsa.Models.AllitemsModel
import com.example.forsa.R
import com.example.forsa.databinding.FragmentAllitemsBinding

class Allitems : Fragment() {

    private lateinit var binding: FragmentAllitemsBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllitemsBinding.inflate(layoutInflater, container, false)

        // Create an ArrayList of AllitemsModel objects
        val itemsList = ArrayList<AllitemsModel>()
        val item1 = AllitemsModel(R.drawable.shoe_img, "Shoes", "Nike Friends and Family", "40/41/43/44","Price: \$74.50")
        val item2 = AllitemsModel(R.drawable.all_items_img_ii, "headphone", "The best Beats headphones", "Size:...","Price: \$74.50")
        val item3 = AllitemsModel(R.drawable.all_items_img_iii, "Watch", "Zeblaze Watch for Mens", "Size:...","Price: \$74.50")
        val item4 = AllitemsModel(R.drawable.all_items_img_iv, "headphone", "Shokz Official | The  Professional Bone", "Szie:...","Price: \$74.50")
        val item5 = AllitemsModel(R.drawable.all_items_img_vi, "shorts", "Shokz Official | The Professional Bone", "Size:...","Price: \$74.50")
        val item6 = AllitemsModel(R.drawable.all_items_img_vii, "shoes", "Puma Ultra 3.2 FG/AG men’s Football", "Size:...","Price: \$74.50")
        val item7 = AllitemsModel(R.drawable.all_items_img_vi, "shorts", "Puma Ultra 3.2 FG/AG men’s Football", "Size:...","Price: \$74.50")
        val item8 = AllitemsModel(R.drawable.all_items_img_ii, "watch", "Puma Ultra 3.2 FG/AG men’s Football", "Size:...","Price: \$74.50")
        itemsList.add(item1)
        itemsList.add(item2)
        itemsList.add(item3)
        itemsList.add(item4)
        itemsList.add(item5)
        itemsList.add(item6)
        itemsList.add(item7)
        itemsList.add(item8)

        val recyclerView = binding.allitemsRecycler
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


        // Create a custom adapter for the RecyclerView and set it
        val adapter = AlIitemsAdapter(itemsList)
        recyclerView.adapter = adapter

        return binding.root
    }





}