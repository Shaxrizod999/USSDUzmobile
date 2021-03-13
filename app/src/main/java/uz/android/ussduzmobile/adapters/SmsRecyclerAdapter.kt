package uz.android.ussduzmobile.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.android.ussduzmobile.R
import uz.android.ussduzmobile.fragments.InternetFragment
import uz.android.ussduzmobile.fragments.SmsFragment
import uz.android.ussduzmobile.models.InternetModel
import uz.android.ussduzmobile.models.SmsModel
import java.util.ArrayList

class SmsRecyclerAdapter(var list: ArrayList<SmsModel>, val onClick: SmsFragment):
        RecyclerView.Adapter<SmsRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        fun onBind(model: SmsModel) {
            itemView.apply {
                findViewById<TextView>(R.id.smscode).text = model.smsCode
                findViewById<TextView>(R.id.smsnamecode).text = model.smsName
                findViewById<TextView>(R.id.smsdesc_ussd).text = model.name_desc
                findViewById<TextView>(R.id.smsmalimot).text = model.desc
            }

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_excample4, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int = list.size
}