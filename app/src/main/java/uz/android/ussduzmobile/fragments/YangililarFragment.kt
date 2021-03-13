package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.android.ussduzmobile.databinding.FragmentYangililarBinding

class YangililarFragment : Fragment() {

    private lateinit var binding: FragmentYangililarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYangililarBinding.inflate(inflater, container, false)

        return binding.root
    }
}