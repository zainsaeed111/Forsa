package com.example.forsa.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.forsa.Models.IndChatModel
import com.example.forsa.databinding.IndvidualChatListItemsBinding

class IndChatAdapter(private val indChatItems: List<IndChatModel>) :
    RecyclerView.Adapter<IndChatAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = IndvidualChatListItemsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return indChatItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val indChatModel = indChatItems[position]
        holder.bind(indChatModel)
    }

    inner class ItemViewHolder(private val binding: IndvidualChatListItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(indChatModel: IndChatModel) {
            binding.apply {
                itemDateIndchat.text = indChatModel.itemDate_Indchat
                sendchatTime.text = indChatModel.sendchat_Time
                sendMessage.text = indChatModel.send_Message
                chatImgi.setImageResource(indChatModel.chat_Imgi)
                chatImgii.setImageResource(indChatModel.chat_Imgii)
                recivechatTime.text = indChatModel.recivechatTime
                reciveMessage.text = indChatModel.recive_Message
            }
        }
    }
    }



