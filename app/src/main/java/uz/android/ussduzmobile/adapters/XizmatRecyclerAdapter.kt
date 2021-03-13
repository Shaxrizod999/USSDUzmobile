package uz.android.ussduzmobile.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.fragments.XizmatlarFragment
import uz.android.ussduzmobile.models.Tarif
import uz.android.ussduzmobile.models.UssdModel
import uz.android.ussduzmobile.models.XizmatlarModel
import java.util.ArrayList


class XizmatRecyclerAdapter(var list: ArrayList<XizmatlarModel>, val onClick: XizmatlarFragment):
    RecyclerView.Adapter<XizmatRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        fun onBind(model: XizmatlarModel) {
            itemView.apply {
                findViewById<TextView>(R.id.xizmat_name).text = model.name
                findViewById<TextView>(R.id.xizmat_mal).text = model.littledesc
                findViewById<TextView>(R.id.xizmat_malumot).text = model.desc
            }

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_excample2, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int = list.size
}