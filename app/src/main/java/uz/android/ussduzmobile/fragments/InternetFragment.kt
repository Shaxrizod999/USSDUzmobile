package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.adapters.InternetRecyclerAdapter
import uz.android.ussduzmobile.databinding.FragmentInternetBinding
import uz.android.ussduzmobile.models.InternetModel

class InternetFragment : Fragment() {

    private lateinit var binding: FragmentInternetBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInternetBinding.inflate(inflater, container, false)

        binding.Hammasi.setOnClickListener{
            binding.rv.adapter = InternetRecyclerAdapter(initList() as java.util.ArrayList<InternetModel>, this)
            binding.haftalik.setBackgroundColor(R.drawable.back_style1)
            binding.kunlik.setBackgroundColor(R.drawable.back_style1)
            binding.oylik.setBackgroundColor(R.drawable.back_style1)
        }

        binding.haftalik.setOnClickListener{
            binding.rv.adapter = InternetRecyclerAdapter(initList1() as java.util.ArrayList<InternetModel>, this)
            binding.Hammasi.setBackgroundColor(R.drawable.back_style1)
            binding.kunlik.setBackgroundColor(R.drawable.back_style1)
            binding.oylik.setBackgroundColor(R.drawable.back_style1)
        }

        binding.kunlik.setOnClickListener{
            binding.rv.adapter = InternetRecyclerAdapter(initList2() as java.util.ArrayList<InternetModel>, this)
            binding.Hammasi.setBackgroundColor(R.drawable.back_style1)
            binding.haftalik.setBackgroundColor(R.drawable.back_style1)
            binding.oylik.setBackgroundColor(R.drawable.back_style1)
        }
        binding.oylik.setOnClickListener{
            binding.rv.adapter = InternetRecyclerAdapter(initList3() as java.util.ArrayList<InternetModel>, this)
            binding.Hammasi.setBackgroundColor(R.drawable.back_style1)
            binding.haftalik.setBackgroundColor(R.drawable.back_style1)
            binding.kunlik.setBackgroundColor(R.drawable.back_style1)
        }
        binding.arrow.setOnClickListener{
            findNavController().navigate(R.id.boshSahifaFragment)
            onStart()
        }

        return binding.root
    }




    private fun initList1(): List<InternetModel> {

        val list = ArrayList<InternetModel>()

        for (i in 1..20) {
            list.add(
                    InternetModel(
                            "50", "50 MB",
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
    private fun initList3(): List<InternetModel> {

        val list = ArrayList<InternetModel>()

        for (i in 1..20) {
            list.add(
                    InternetModel(
                            "5000", "5000 MB",
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
    private fun initList2(): List<InternetModel> {

        val list = ArrayList<InternetModel>()

        for (i in 1..20) {
            list.add(
                    InternetModel(
                            "10", "10 MB",
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

    private fun initList(): List<InternetModel> {

        val list = ArrayList<InternetModel>()

        for (i in 1..20) {
            list.add(
                    InternetModel(
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