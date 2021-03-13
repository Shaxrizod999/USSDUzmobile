package uz.android.ussduzmobile.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.fragments.InternetFragment
import uz.android.ussduzmobile.models.InternetModel
import java.util.ArrayList


class InternetRecyclerAdapter(var list: ArrayList<InternetModel>, val onClick: InternetFragment):
        RecyclerView.Adapter<InternetRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        fun onBind(model: InternetModel) {
            itemView.apply {
                findViewById<TextView>(R.id.code).text = model.internetCode
                findViewById<TextView>(R.id.namecode).text = model.internetName
                findViewById<TextView>(R.id.desc_ussd).text = model.name_desc
                findViewById<TextView>(R.id.malimot).text = model.desc
            }

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_excample3, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int = list.size
}