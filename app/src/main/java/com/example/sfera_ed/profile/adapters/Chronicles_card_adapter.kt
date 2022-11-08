package com.example.sfera_ed.profile.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera_ed.R
import com.example.sfera_ed.databinding.ChroniclesCardItemBinding
import com.example.sfera_ed.profile.models.Chronicles_card

class Chronicles_card_adapter : RecyclerView.Adapter<Chronicles_card_adapter.Chronicles_card_holder>(){
    val chroniclesCardList = ArrayList<Chronicles_card>()


    class Chronicles_card_holder(item : View) : RecyclerView.ViewHolder(item){
        val binding = ChroniclesCardItemBinding.bind(item)
        fun bind(chroniclesCard : Chronicles_card) = with(binding){
            chroniclesCardImage.setImageResource(chroniclesCard.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Chronicles_card_holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chronicles_card_item, parent, false)
        return Chronicles_card_holder(view)
    }

    override fun onBindViewHolder(holder: Chronicles_card_holder, position: Int) {
        holder.bind(chroniclesCardList[position])
    }

    override fun getItemCount(): Int {
        return chroniclesCardList.size
    }

    fun addChroniclesCard(chroniclesCard: Chronicles_card){
        chroniclesCardList.add(chroniclesCard)
        notifyDataSetChanged()
    }

}