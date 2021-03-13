package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.databinding.FragmentSozlamalarBinding


class SozlamalarFragment : Fragment() {

    private lateinit var binding: FragmentSozlamalarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  FragmentSozlamalarBinding.inflate(inflater, container, false)

        return binding.root
    }
}