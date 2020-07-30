package com.sefu.navigationx.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sefu.navigationx.databinding.FragmentEditBinding

class FragmentEdit : Fragment() {
    private lateinit var binding: FragmentEditBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEditBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.buttonSend.setOnClickListener {
            val name = binding.editTextTextPersonName.text.toString()
            findNavController().navigate(
                FragmentEditDirections.actionFragmentEditToFragmentResult(
                    name = name
                )
            )
        }
    }
}