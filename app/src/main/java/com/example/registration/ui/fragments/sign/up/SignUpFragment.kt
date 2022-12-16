package com.example.registration.ui.fragments.sign.up

import androidx.navigation.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.registration.R
import com.example.registration.base.BaseFragment
import com.example.registration.data.local.sharedpreferences.userdata.UserPreferencesData
import com.example.registration.databinding.FragmentSignUpBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignUpFragment : BaseFragment<FragmentSignUpBinding>(R.layout.fragment_sign_up) {
    override val binding by viewBinding(FragmentSignUpBinding::bind)

    @Inject
    lateinit var userPreferencesData: UserPreferencesData

    override fun setupListener() {
        binding.btnRegistration.setOnClickListener {
            userPreferencesData.isAuthorized = true
            requireActivity().findNavController(R.id.nav_host_fragment)
                .navigate(R.id.action_global_mainFlowFragment)
        }
    }
}