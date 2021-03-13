package uz.android.ussduzmobile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.android.ussduzmobile.models.Tariflar
import uz.android.ussduzmobile.databinding.FragmentViewPagerDataBinding
import java.io.Serializable

private const val ARG_PARAM1 = "param1"

class ViewPagerDataFragment : Fragment() {
    private var ser: Serializable? = null
    private lateinit var binding: FragmentViewPagerDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            ser = it.getSerializable(ARG_PARAM1)
        }
    }
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View? {
        binding =  FragmentViewPagerDataBinding.inflate(inflater, container, false)

        val tarif: Tariflar = ser as Tariflar

        binding.tariflar.text = tarif.tarifnomi
        binding.daqiqa1.text = tarif.tarifminut
        binding.megabayt1.text = tarif.tarifmegabayt
        binding.smslar1.text = tarif.tarifsms
        binding.narx.text = tarif.tarifnarxi

        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: Tariflar) =
                ViewPagerDataFragment().apply {
                    arguments = Bundle().apply {
                        putSerializable(ARG_PARAM1, param1)
                    }
                }
    }
}