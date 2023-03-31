package com.example.forsa.MidFragments

import android.graphics.Canvas
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.forsa.Adapters.InboxChatAdapter
import com.example.forsa.Adapters.NotificationAdapter
import com.example.forsa.Models.InboxChatModel
import com.example.forsa.Models.NotificationModel
import com.example.forsa.R
import com.example.forsa.databinding.FragmentNotificationBinding
import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator

class Notification : Fragment() {

    private lateinit var binding: FragmentNotificationBinding
    private lateinit var notiViewAllItems: MutableList<NotificationModel>
    private lateinit var adapter: NotificationAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding=FragmentNotificationBinding.inflate(layoutInflater,container,false)
        NotificationListShow()
        return binding.root
    }



    private fun NotificationListShow() {

        val recyclerView = binding.notificationListrecycler
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

// Create a list of InboxChatModel items with different values

        val notiViewAllItems = ArrayList<NotificationModel>()

        notiViewAllItems.add(NotificationModel(R.drawable.noti_img_i, "Your has been pleased", "Yesterday 10 : 30 AM" ))
        notiViewAllItems.add(NotificationModel(R.drawable.noti_img_ii, "Your order has been completed", "Yesterday 10 : 30 AM"))
        notiViewAllItems.add(NotificationModel(R.drawable.noti_img_iii, "Christmas sale now on all the stores", "Yesterday 10 : 30 AM"))
        notiViewAllItems.add(NotificationModel(R.drawable.noti_img_i, "50% sale on now ", "Yesterday 10 : 30 AM"))
        notiViewAllItems.add(NotificationModel(R.drawable.noti_img_iii, "New products are available", "Yesterday 10 : 30 AM"))
        notiViewAllItems.add(NotificationModel(R.drawable.noti_img_iv, "Get Discount on Master card", "Yesterday 10 : 30 AM"))
        notiViewAllItems.add(NotificationModel(R.drawable.noti_img_iii, "New products — sale 20%", "Yesterday 10 : 30 AM"))
        notiViewAllItems.add(NotificationModel(R.drawable.noti_img_ii, "Zain Saeed", "Yesterday 10 : 30 AM"))
        notiViewAllItems.add(NotificationModel(R.drawable.noti_img_iv, "Kashif", "Yesterday 10 : 30 AM"))
        val adapter = NotificationAdapter(notiViewAllItems)
        recyclerView.adapter = adapter

// Step 1: Create a callback for swipe actions
        val swipeCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {

            // Step 2: Implement onMove() to disable dragging
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            // Step 3: Implement onSwiped() to remove item from the list
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                notiViewAllItems.removeAt(position)
                adapter.notifyItemRemoved(position)
            }

            // Step 4: Override onChildDraw() to draw the delete icon
            override fun onChildDraw(
                c: Canvas,
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                dX: Float,
                dY: Float,
                actionState: Int,
                isCurrentlyActive: Boolean
            ) {
                RecyclerViewSwipeDecorator.Builder(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
                    .addActionIcon(R.drawable.delete_icon_notification)
                    .create()
                    .decorate()
                super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
            }

        }

        // Step 5: Attach the ItemTouchHelper to the RecyclerView
        val itemTouchHelper = ItemTouchHelper(swipeCallback)
        itemTouchHelper.attachToRecyclerView(recyclerView)
    }


    }
/*
    private fun enableSwipe() {
        val simpleItemTouchCallback: ItemTouchHelper.SimpleCallback =
            object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {

                override fun onMove(
                    recyclerView: RecyclerView,
                    viewHolder: RecyclerView.ViewHolder,
                    target: RecyclerView.ViewHolder
                ): Boolean {
                    return false
                }

                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                    val position = viewHolder.adapterPosition
                    notiViewAllItems.removeAt(position)
                    adapter.notifyItemRemoved(position)
                }
                override fun onChildDraw(
                    c: Canvas,
                    recyclerView: RecyclerView,
                    viewHolder: RecyclerView.ViewHolder,
                    dX: Float,
                    dY: Float,
                    actionState: Int,
                    isCurrentlyActive: Boolean
                ) {
                    val itemView = viewHolder.itemView
                    val iconMargin = (itemView.height - deleteIcon.intrinsicHeight) / 2
                    val iconTop = itemView.top + (itemView.height - deleteIcon.intrinsicHeight) / 2
                    val iconBottom = iconTop + deleteIcon.intrinsicHeight

                    when {
                        dX < 0 -> {
                            val iconLeft = itemView.right - iconMargin - deleteIcon.intrinsicWidth
                            val iconRight = itemView.right - iconMargin
                            deleteIcon.setBounds(iconLeft, iconTop, iconRight, iconBottom)
                        }
                        else -> {
                            val iconLeft = itemView.left + iconMargin
                            val iconRight = itemView.left + iconMargin + deleteIcon.intrinsicWidth
                            deleteIcon.setBounds(iconLeft, iconTop, iconRight, iconBottom)
                        }
                    }

                    c.save()
                    if (dX < 0) {
                        c.clipRect(
                            itemView.right + dX.toInt(),
                            itemView.top,
                            itemView.right,
                            itemView.bottom
                        )
                    } else {
                        c.clipRect(
                            itemView.left,
                            itemView.top,
                            itemView.left + dX.toInt(),
                            itemView.bottom
                        )
                    }

                    deleteIcon.draw(c)
                    c.restore()

                    super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
                }
            }

        val itemTouchHelper = ItemTouchHelper(simpleItemTouchCallback)
        itemTouchHelper.attachToRecyclerView(binding.notificationListrecycler)
    }
*/







