package com.anushka.navdemo5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.anushka.navdemo5.databinding.FragmentEmailBinding
import com.anushka.navdemo5.databinding.FragmentWelcomeBinding

/**
 * A simple [Fragment] subclass.
 */
class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    private val viewModel : JoiningProgressViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_welcome, container, false)
        viewModel.name.observe(this, Observer {
            binding.nameTextView.text = it.toString()
        })
        viewModel.email.observe(this, Observer {
            binding.emailTextView.text = it.toString()
        })
        binding.viewTermsButton.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_termsFragment)
        }
        return binding.root
    }
}
