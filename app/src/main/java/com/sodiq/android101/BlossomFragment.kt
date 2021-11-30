package com.sodiq.android101

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class BlossomFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(context).inflate(R.layout.fragment_blossom, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val blossomButton = view.findViewById<Button>(R.id.blossom_btn)
        blossomButton.setOnClickListener {
            findNavController().navigate(R.id.action_blossomFragment_to_blossomInputFragment)
        }
    }
}