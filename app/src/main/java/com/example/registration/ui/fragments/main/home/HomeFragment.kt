package com.example.registration.ui.fragments.main.home

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.registration.R
import com.example.registration.base.BaseFragment
import com.example.registration.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    override val binding by viewBinding(FragmentHomeBinding::bind)

}