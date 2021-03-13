package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.adapters.InternetRecyclerAdapter
import uz.android.ussduzmobile.adapters.UssdRecyclerAdapter
import uz.android.ussduzmobile.databinding.FragmentUssdBinding
import uz.android.ussduzmobile.models.UssdModel

class UssdFragment : Fragment() {

    private lateinit var binding: FragmentUssdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUssdBinding.inflate(inflater, container, false)

        binding.rv.adapter = UssdRecyclerAdapter(initList() as java.util.ArrayList<UssdModel>, this)

        binding.arrow.setOnClickListener{
            findNavController().navigate(R.id.boshSahifaFragment)
        }
        return binding.root
    }

    private fun initList(): List<UssdModel> {

        val list = ArrayList<UssdModel>()

        for (i in 1..20) {
            list.add(
                UssdModel(
                    "*104#", "Mening raqamim",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik\n" +
                            "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi.",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                            "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
                            "imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi."
                )
            )
        }
        return list
    }
}
