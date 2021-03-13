package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.adapters.SmsRecyclerAdapter
import uz.android.ussduzmobile.databinding.FragmentSmsBinding
import uz.android.ussduzmobile.models.SmsModel

class SmsFragment : Fragment() {

    private lateinit var binding: FragmentSmsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSmsBinding.inflate(inflater, container, false)

        binding.Hammasi.setOnClickListener {
            binding.rv.adapter =
                SmsRecyclerAdapter(initList() as java.util.ArrayList<SmsModel>, this)
            binding.haftalik.setBackgroundColor(R.drawable.back_style1)
            binding.kunlik.setBackgroundColor(R.drawable.back_style1)
            binding.oylik.setBackgroundColor(R.drawable.back_style1)
        }

        binding.haftalik.setOnClickListener {
            binding.rv.adapter =
                SmsRecyclerAdapter(initList1() as java.util.ArrayList<SmsModel>, this)
            binding.Hammasi.setBackgroundColor(R.drawable.back_style1)
            binding.kunlik.setBackgroundColor(R.drawable.back_style1)
            binding.oylik.setBackgroundColor(R.drawable.back_style1)
        }

        binding.kunlik.setOnClickListener {
            binding.rv.adapter =
                SmsRecyclerAdapter(initList2() as java.util.ArrayList<SmsModel>, this)
            binding.Hammasi.setBackgroundColor(R.drawable.back_style1)
            binding.haftalik.setBackgroundColor(R.drawable.back_style1)
            binding.oylik.setBackgroundColor(R.drawable.back_style1)
        }
        binding.oylik.setOnClickListener {
            binding.rv.adapter =
                SmsRecyclerAdapter(initList3() as java.util.ArrayList<SmsModel>, this)
            binding.Hammasi.setBackgroundColor(R.drawable.back_style1)
            binding.haftalik.setBackgroundColor(R.drawable.back_style1)
            binding.kunlik.setBackgroundColor(R.drawable.back_style1)
        }
        binding.arrow.setOnClickListener {
            findNavController().navigate(R.id.boshSahifaFragment)
            onStart()
        }

        return binding.root
    }


    private fun initList1(): List<SmsModel> {

        val list = ArrayList<SmsModel>()

        for (i in 1..20) {
            list.add(
                SmsModel(
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

    private fun initList3(): List<SmsModel> {

        val list = ArrayList<SmsModel>()

        for (i in 1..20) {
            list.add(
                SmsModel(
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

    private fun initList2(): List<SmsModel> {

        val list = ArrayList<SmsModel>()

        for (i in 1..20) {
            list.add(
                SmsModel(
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

    private fun initList(): List<SmsModel> {

        val list = ArrayList<SmsModel>()

        for (i in 1..20) {
            list.add(
                SmsModel(
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
