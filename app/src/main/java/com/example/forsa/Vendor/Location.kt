package com.example.forsa.Vendor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.forsa.R
import com.example.forsa.databinding.FragmentAddItemsBinding
import com.example.forsa.databinding.FragmentLocationBinding


class Location : Fragment() {


    private lateinit var binding: FragmentLocationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentLocationBinding.inflate(layoutInflater,container,false)
        binding.additemNextbtn.setOnClickListener(){
            // Set bottom sheet state to expanded


            findNavController().navigate(R.id.action_location2_to_addItemsImages)

        }
        binding.btnSelecetcountry.setOnClickListener {
               val bottomSheet = CountryBottomSheet()
               bottomSheet.show(childFragmentManager, "CountryBottomSheet")
        }
        return binding.root
    }

}