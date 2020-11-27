package com.omardhanishdon.sampleapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class listAdapter(val context: Context) : RecyclerView.Adapter<listAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_list , parent , false))
    }

    override fun getItemCount(): Int {
        return 100
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.tv1.text = "Gokul " + position
            holder.tv2.text = "Number " + position
            holder.tv3.text = "Date " + position
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        var tv1 : TextView
        var tv2 : TextView
        var tv3 : TextView

        init {
            tv1 = itemView.findViewById(R.id.tv1)
            tv2 = itemView.findViewById(R.id.tv2)
            tv3 = itemView.findViewById(R.id.tv3)
        }

    }

}