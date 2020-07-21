package com.myapps.android.driver.feature.profile

//import android.databinding.DataBindingUtil
import android.os.Bundle
//import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
//import com.myapps.android.driver.ProfileFragmentDirections
import com.myapps.android.driver.R
import com.myapps.android.driver.databinding.ProfileFragmentBinding

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<ProfileFragmentBinding>(
            inflater,
            R.layout.profile_fragment, container, false
        )

        binding.profileDetailButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(ProfileFragmentDirections.actionProfileFragmentToProfileDetailsFragment())
        }

        binding.studentButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(ProfileFragmentDirections.actionProfileFragmentToStudentFragment())

        }

        return binding.root

    }

    private fun studentClickHandlerFunction(view: View) {
        //
    }

}