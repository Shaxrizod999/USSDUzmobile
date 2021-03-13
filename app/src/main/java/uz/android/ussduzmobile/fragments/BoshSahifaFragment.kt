package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.adapters.ViewPagerAdapter
import uz.android.ussduzmobile.models.Tariflar
import uz.android.ussduzmobile.databinding.FragmentBoshSahifaBinding

class BoshSahifaFragment : Fragment() {
    private lateinit var binding: FragmentBoshSahifaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentBoshSahifaBinding.inflate(inflater, container, false)
        val viewPagerAdapter = ViewPagerAdapter(initList(), childFragmentManager)
        binding.viewPager.adapter = viewPagerAdapter

        binding.fb1.setOnClickListener{
            findNavController().navigate(R.id.ussdFragment)
        }
        binding.fb2.setOnClickListener{
            findNavController().navigate(R.id.tariflarFragment)
        }

        binding.fb3.setOnClickListener{
            findNavController().navigate(R.id.xizmatlarFragment)
        }
        binding.fb5.setOnClickListener{
            findNavController().navigate(R.id.internetFragment)
        }
        binding.fb6.setOnClickListener {
            findNavController().navigate(R.id.smsFragment)
        }
        return binding.root
    }
    private fun initList(): List<Tariflar> {
        return listOf(
            Tariflar("Просто 10", "10 MIN",
                "10 MB", "10 SMS", "10 000 сум в месяц"),
            Tariflar("Street", "1 500 MIN",
                "5 000 MB", "750 SMS", "39 900 so'm oyiga"),
            Tariflar("Flash", "2 000 MIN",
                "14 000 MB", "500 SMS", "69 900 so'm oyiga"),
            Tariflar("Royal", "Chaksiz",
                "Cheksiz", "5 000 SMS", "149 900 so'm oyiga"),
            Tariflar("Ishbilarmon", "",
                "20 000 MB", "3 000", "99 000"),
            Tariflar("Street Upgrade",
                "6000 MIN", "20 000 MB", "3 000 SMS", "119 700"),
            Tariflar("Flash Upgrade",
                "8 000 MIN", "56 000 MB", "6 000 SMS", "56 000 MB"),
            Tariflar("Onlime",
                "2 000 MIN", "10 000 MB", "1 000 SMS", "49 900 MB")
        )
    }
}