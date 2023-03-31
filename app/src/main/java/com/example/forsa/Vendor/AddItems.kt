package com.example.forsa.Vendor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.forsa.R
import com.example.forsa.databinding.CountryListItemsBinding
import com.example.forsa.databinding.FragmentAddItemsBinding


class AddItems : Fragment() {

    private lateinit var binding: FragmentAddItemsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentAddItemsBinding.inflate(layoutInflater,container,false)
        binding.additemNextbtn.setOnClickListener {
            findNavController().navigate(R.id.location2)
        }

        return binding.root
    }

}