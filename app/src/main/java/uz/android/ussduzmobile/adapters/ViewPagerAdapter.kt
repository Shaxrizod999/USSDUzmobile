package uz.android.ussduzmobile.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import uz.android.ussduzmobile.models.Tariflar
import uz.android.ussduzmobile.fragments.ViewPagerDataFragment

class ViewPagerAdapter(private val list: List<Tariflar>,fm: FragmentManager) : FragmentStatePagerAdapter (fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {

        return ViewPagerDataFragment.newInstance(list[position])
    }


}