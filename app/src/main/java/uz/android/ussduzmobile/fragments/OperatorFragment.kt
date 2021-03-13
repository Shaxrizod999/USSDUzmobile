package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.android.ussduzmobile.databinding.FragmentOperatorBinding

class OperatorFragment : Fragment() {

    private lateinit var binding: FragmentOperatorBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentOperatorBinding.inflate(inflater, container, false)

        return binding.root
    }

}