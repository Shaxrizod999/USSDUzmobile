package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.adapters.TariflarRecyclerAdapter
import uz.android.ussduzmobile.databinding.FragmentTariflarBinding
import uz.android.ussduzmobile.models.Tarif

class TariflarFragment : Fragment() {

    private lateinit var binding: FragmentTariflarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTariflarBinding.inflate(inflater, container, false)

        binding.rv.adapter = TariflarRecyclerAdapter(initList() as java.util.ArrayList<Tarif>, this)

        binding.arrow.setOnClickListener{
            findNavController().navigate(R.id.boshSahifaFragment)
            onStart()
        }

        return binding.root
    }

    private fun initList(): List<Tarif> {

        val list = ArrayList<Tarif>()

        for (i in 1..20) {
            list.add(
                Tarif(
                    "*Oddiy 10",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati \n" +
                            "mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni ta'minlash uchun texnik \n" +
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
