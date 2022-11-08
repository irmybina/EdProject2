package com.example.sfera_ed.profile.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera_ed.R
import com.example.sfera_ed.databinding.MomentItemBinding
import com.example.sfera_ed.profile.models.Moment

class Moment_adapter : RecyclerView.Adapter<Moment_adapter.Moment_holder>(){
    val momentList = ArrayList<Moment>()

    class Moment_holder(item : View) : RecyclerView.ViewHolder(item){
        val binding = MomentItemBinding.bind(item)
        fun bind(moment: Moment) = with(binding){
            momentImage.setImageResource(moment.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Moment_holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.moment_item, parent, false)
        return Moment_holder(view)
    }

    override fun onBindViewHolder(holder: Moment_holder, position: Int) {
        holder.bind(momentList[position])
    }

    override fun getItemCount(): Int {
        return momentList.size
    }

    fun addMoment(moment: Moment){
        momentList.add(moment)
        notifyDataSetChanged()
    }
}