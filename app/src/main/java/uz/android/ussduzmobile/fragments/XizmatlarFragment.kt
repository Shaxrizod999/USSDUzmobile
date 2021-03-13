package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.adapters.XizmatRecyclerAdapter
import uz.android.ussduzmobile.databinding.FragmentXizmatlarBinding
import uz.android.ussduzmobile.models.Tarif
import uz.android.ussduzmobile.models.UssdModel
import uz.android.ussduzmobile.models.XizmatlarModel

class XizmatlarFragment : Fragment() {

    private lateinit var binding: FragmentXizmatlarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentXizmatlarBinding.inflate(inflater, container, false)

        binding.rv.adapter = XizmatRecyclerAdapter(initList() as java.util.ArrayList<XizmatlarModel>, this)

        binding.arrow.setOnClickListener{
            findNavController().navigate(R.id.boshSahifaFragment)
        }

        return binding.root
    }

    private fun initList(): List<XizmatlarModel> {

        val list = ArrayList<XizmatlarModel>()

        for (i in 1..20) {
            list.add(
                XizmatlarModel(
                    "*LTE 4G",
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
