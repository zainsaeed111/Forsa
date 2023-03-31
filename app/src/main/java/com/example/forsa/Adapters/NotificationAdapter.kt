package com.example.forsa.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.forsa.Models.NotificationModel
import com.example.forsa.R
import com.example.forsa.databinding.NotificationListItemsBinding

class NotificationAdapter(private val notiItems: MutableList<NotificationModel>) :
    RecyclerView.Adapter<NotificationAdapter.ItemViewHolder>() {

//    private lateinit var swipeToDeleteCallback: SwipeToDeleteCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = NotificationListItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return notiItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val listModel = notiItems[position]
        holder.textNotification.text = listModel.text_notifiction
        holder.timeNotification.text = listModel.time_notifiction
        holder.imgNotification.setImageResource(listModel.img_notifiction)

        // Set an OnClickListener to the item view
        holder.itemView.setOnClickListener {
            // Handle item click here
        }
    }

    inner class ItemViewHolder(private val binding: NotificationListItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var textNotification: TextView = binding.textNotification
        var timeNotification: TextView = binding.timeNotification
        var imgNotification: ImageView = binding.imgNotification
      //  var btnDelete: ImageView = binding.btnDelete

/*
        init {
            // Initialize the swipe-to-delete feature
            swipeToDeleteCallback = object : SwipeToDeleteCallback() {
                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                    // Delete the item when swiped
                    val position = viewHolder.adapterPosition
                    notiItems.removeAt(position)
                    notifyItemRemoved(position)
                }
            }

            ItemTouchHelper(swipeToDeleteCallback).attachToRecyclerView(binding.root.findViewById(R.id.notificationListrecycler))
        }
*/
    }
}
