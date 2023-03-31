package com.example.forsa.Vendor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.forsa.Adapters.CountryAdapter
import com.example.forsa.Adapters.WidrathAdapter
import com.example.forsa.Models.CountryModel
import com.example.forsa.Models.WidrathModel
import com.example.forsa.R
import com.example.forsa.databinding.FragmentCountryBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class CountryBottomSheet : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentCountryBottomSheetBinding

 override fun getTheme() = R.style.NoBackgroundDialogTheme

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountryBottomSheetBinding.inflate(inflater, container, false)
        showCountryList()
        return binding.root
    }

    private fun showCountryList() {




        val recyclerView = binding.countryRecycler
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val countryList = ArrayList<CountryModel>()
        countryList.add(CountryModel(R.drawable.conutry_list_flag_i, "Canada"))
        countryList.add(CountryModel(R.drawable.conutry_list_flag_ii, "United Arab Emirates "))
        countryList.add(CountryModel(R.drawable.conutry_list_flag_iii, "Germany"))
        countryList.add(CountryModel(R.drawable.conutry_list_flag_v, "Netherlands"))
        countryList.add(CountryModel(R.drawable.conutry_list_flag_vi, "Morocco"))
        val adapter = CountryAdapter(countryList)
        recyclerView.adapter = adapter
    }
}
