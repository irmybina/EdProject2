package com.example.sfera_ed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sfera_ed.databinding.PeopleItemBinding

class People_adapter : RecyclerView.Adapter<People_adapter.People_holder>(){
    val peopleList = ArrayList<People>()


    class People_holder(item : View) : RecyclerView.ViewHolder(item){
        val binding = PeopleItemBinding.bind(item)
        fun bind(people: People) = with(binding){
            val image = people.imageUrl

            Glide.with(binding.peopleImg)
                .load(image)
                .fitCenter()
                .circleCrop()
                .into(peopleImg)

            peopleName.text = people.name

//            binding.subButton.setOnClickListener{
//                if (subButton.text.equals("@string/unsubscribe")) subButton.text == "@string/subscribe"
//                else subButton.text == "uns"
//            }
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): People_holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.people_item, parent, false)
        return People_holder(view)
    }

    override fun onBindViewHolder(holder: People_holder, position: Int) {
        holder.bind(peopleList[position])
    }

    override fun getItemCount(): Int {
        return peopleList.size
    }

    fun addPeople(people: People){
        peopleList.add(people)
        notifyDataSetChanged()
    }

}