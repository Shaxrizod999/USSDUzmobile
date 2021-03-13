package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.android.ussduzmobile.databinding.FragmentBalansBinding

class BalansFragment : Fragment() {

    private lateinit var binding: FragmentBalansBinding
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View? {
        binding =  FragmentBalansBinding.inflate(inflater, container, false)

        return binding.root
    }

}