package com.example.forsa.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.forsa.Models.NotificationModel
import com.example.forsa.Models.WidrathModel
import com.example.forsa.databinding.NotificationListItemsBinding
import com.example.forsa.databinding.WidrathListItemsBinding

class WidrathAdapter(private val widItems: MutableList<WidrathModel>) :
    RecyclerView.Adapter<WidrathAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = WidrathListItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return widItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val listModel = widItems[position]
        holder.widTime.text = listModel.tv_wid_Time
        holder.widDate.text = listModel.tv_wid_Date
        holder.widAmount.text= listModel.tv_wid_Amount.toString()

        // Set an OnClickListener to the item view
        holder.itemView.setOnClickListener {
            // Handle item click here
        }
    }

    inner class ItemViewHolder(private val binding: WidrathListItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var widTime: TextView = binding.tvwidTime
        var widDate: TextView = binding.tvwidDate
        var widAmount: TextView = binding.tvwidAmount


    }
}
