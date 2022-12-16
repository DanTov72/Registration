package com.example.registration.ui.fragments.sign.`in`

import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.registration.R
import com.example.registration.base.BaseFragment
import com.example.registration.data.local.sharedpreferences.userdata.UserPreferencesData
import com.example.registration.databinding.FragmentSignInBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignInFragment : BaseFragment<FragmentSignInBinding>(R.layout.fragment_sign_in) {
    override val binding by viewBinding(FragmentSignInBinding::bind)

    @Inject
    lateinit var userPreferencesData: UserPreferencesData

    override fun setupListener() {
        binding.btnSignIn.setOnClickListener {
            userPreferencesData.isAuthorized = true
            requireActivity().findNavController(R.id.nav_host_fragment)
                .navigate(R.id.action_global_mainFlowFragment)
        }
        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.signUpFragment)
        }
    }
}