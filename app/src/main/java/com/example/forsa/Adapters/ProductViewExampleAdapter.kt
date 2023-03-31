package com.example.forsa.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.forsa.Models.AddImagesExampleModel
import com.example.forsa.R

class ProductViewExampleAdapter(
    private val imagesList: List<AddImagesExampleModel>,
    private val listener: ((Int) -> Unit)? = null
) : RecyclerView.Adapter<ProductViewExampleAdapter.ViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(imageResId: Int)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val newimage: ImageView = itemView.findViewById(R.id.productviewgalleryImg)

        init {
            itemView.setOnClickListener {
                listener?.invoke(imagesList[adapterPosition].add_items_Images)
            }
        }

        fun bind(imageModel: AddImagesExampleModel) {
            // Set image using the drawable resource ID
            newimage.setImageResource(imageModel.add_items_Images)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.productview_img_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(imagesList[position])
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }
}
