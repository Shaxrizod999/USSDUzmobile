package uz.android.ussduzmobile.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.fragments.UssdFragment
import uz.android.ussduzmobile.models.UssdModel
import java.util.ArrayList


class UssdRecyclerAdapter(var list: ArrayList<UssdModel>, val onClick: UssdFragment):
    RecyclerView.Adapter<UssdRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        fun onBind(model: UssdModel) {
            itemView.apply {
                findViewById<TextView>(R.id.code).text = model.ussdCode
                findViewById<TextView>(R.id.namecode).text = model.ussdName
                findViewById<TextView>(R.id.ussd_desc).text = model.desc
            }

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_excample, parent, false))

    }

    override fun onBindViewHolder(holder: UssdRecyclerAdapter.ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int = list.size

}