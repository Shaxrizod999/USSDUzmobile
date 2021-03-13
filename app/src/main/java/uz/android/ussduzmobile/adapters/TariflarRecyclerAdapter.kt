package uz.android.ussduzmobile.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.fragments.TariflarFragment
import uz.android.ussduzmobile.models.Tarif
import java.util.ArrayList


class TariflarRecyclerAdapter(var list: ArrayList<Tarif>, val onClick: TariflarFragment):

    RecyclerView.Adapter<TariflarRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        fun onBind(model: Tarif) {
            itemView.apply {
                findViewById<TextView>(R.id.tarif_name).text = model.tarifName
                findViewById<TextView>(R.id.desc_tarif).text = model.tarifdesc
                findViewById<TextView>(R.id.tarif_malumot).text = model.desc
            }

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_excample1, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int = list.size
}