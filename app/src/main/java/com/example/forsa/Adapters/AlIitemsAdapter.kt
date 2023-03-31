package com.example.forsa.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.forsa.Models.AllitemsModel
import com.example.forsa.Models.InboxChatModel
import com.example.forsa.databinding.AllitemsItemListBinding
import com.example.forsa.databinding.ChatListInboxItemsBinding

class AlIitemsAdapter (private val AllItems: List<AllitemsModel>) :
    RecyclerView.Adapter<AlIitemsAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = AllitemsItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return AllItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val listModel = AllItems[position]
        holder.allitemsproductPrice.text = listModel.allitems_itemPrice
        holder.allitemsitemName.text = listModel.allitems_itemName
        holder.allitemsitemTagline.text = listModel.allitems_itemTagline
        holder.allitemsitemSize.text = listModel.allitems_itemSize
        holder.allitemsproductImg.setImageResource(listModel.allitems_productImg)
    }

    inner class ItemViewHolder(private val binding: AllitemsItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var allitemsitemName: TextView =binding.allitemsitemName
        var allitemsitemTagline: TextView =binding.allitemsitemTagline
        var allitemsitemSize: TextView =binding.allitemsitemSize
        var allitemsproductImg: ImageView =binding.allitemsproductImg
        var allitemsproductPrice: TextView =binding.allitemsitemPrice




    }
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}


