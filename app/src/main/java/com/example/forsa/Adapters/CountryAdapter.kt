package com.example.forsa.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.forsa.Models.CountryModel
import com.example.forsa.Models.WidrathModel
import com.example.forsa.databinding.CountryListItemsBinding
import com.example.forsa.databinding.WidrathListItemsBinding

class CountryAdapter (private val countryItems: MutableList<CountryModel>) :
    RecyclerView.Adapter<CountryAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = CountryListItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return countryItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val listModel = countryItems[position]
        holder.flagCountry.setImageResource(listModel.flag_Country)
        holder.tvnameCountry.text = listModel.tvname_Country

        // Set an OnClickListener to the item view
        holder.itemView.setOnClickListener {
            // Handle item click here
        }
    }

    inner class ItemViewHolder(private val binding: CountryListItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var flagCountry: ImageView = binding.flagCountry
        var tvnameCountry: TextView = binding.tvnameCountry


    }
}
