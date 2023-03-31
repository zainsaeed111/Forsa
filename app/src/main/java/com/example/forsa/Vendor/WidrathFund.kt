package com.example.forsa.Vendor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.forsa.Adapters.NotificationAdapter
import com.example.forsa.Adapters.WidrathAdapter
import com.example.forsa.Models.WidrathModel
import com.example.forsa.R
import com.example.forsa.databinding.FragmentWidrathFundBinding

class WidrathFund : Fragment() {
    private var _binding: FragmentWidrathFundBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWidrathFundBinding.inflate(inflater, container, false)
        widrathListShow()
       binding.btnWidarth.setOnClickListener {
           findNavController().navigate(R.id.action_widrathFund_to_addItems)
       }

        binding.widrathfundConvertbtn.setOnClickListener {
            binding.stripecard.visibility=View.GONE
            binding.etWidrath.visibility=View.VISIBLE
        }

        return binding.root
    }

    private fun widrathListShow() {
        val recyclerView = binding.widrathRecycler
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val widrathList = ArrayList<WidrathModel>()
        widrathList.add(WidrathModel("9:00 AM", "22-03-2023", 500))
        widrathList.add(WidrathModel("10:00 AM", "23-03-2023", 750))
        widrathList.add(WidrathModel("11:00 AM", "24-03-2023", 1000))
        widrathList.add(WidrathModel("9:05 AM", "24-03-2023", 1600))
        widrathList.add(WidrathModel("8:15 PM", "24-03-2023", 100))
        widrathList.add(WidrathModel("10:08 PM", "10-04-2023", 10))
        widrathList.add(WidrathModel("8:15 PM", "1-03-2023", 1850))
        widrathList.add(WidrathModel("1:15 PM", "1-02-2023", 1000))
        val adapter = WidrathAdapter(widrathList)
        recyclerView.adapter = adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
