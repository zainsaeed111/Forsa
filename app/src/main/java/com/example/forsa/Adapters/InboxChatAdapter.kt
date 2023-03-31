package com.example.forsa.Adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.forsa.MidFragments.IndChatPreOrder
import com.example.forsa.Models.InboxChatModel
import com.example.forsa.R
import com.example.forsa.databinding.ChatListInboxItemsBinding
import com.example.forsa.databinding.FragmentInboxBinding

class InboxChatAdapter (private val InboxChatItems: List<InboxChatModel>) :
    RecyclerView.Adapter<InboxChatAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ChatListInboxItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return InboxChatItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val listModel = InboxChatItems[position]
        holder.tvinobxName.text = listModel.tvProfile_name
        holder.tvinobxMessage.text = listModel.tv_Inobx_Message
        holder.tvinobxTime.text = listModel.tv_Inbox_Time
        holder.inboxProfileImg.setImageResource(listModel.inbox_Profile_Img)

        // Set an OnClickListener to the item view
    }

    inner class ItemViewHolder(private val binding: ChatListInboxItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var tvinobxName: TextView=binding.tvinobxName
        var tvinobxMessage: TextView=binding.tvInobxMessage
        var tvinobxTime: TextView=binding.tvInboxTime
        var inboxProfileImg: ImageView=binding.inboxProfileImg




    }
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}







