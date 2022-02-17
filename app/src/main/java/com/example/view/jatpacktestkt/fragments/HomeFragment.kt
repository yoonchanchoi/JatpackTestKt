package com.example.view.jatpacktestkt.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.view.jatpacktestkt.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {

    private var mBinging : FragmentHomeBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentHomeBinding.inflate(inflater, container, false)

        mBinging =binding

        return mBinging?.root

    }

    override fun onDestroyView() {
        mBinging = null
        super.onDestroyView()
    }
}