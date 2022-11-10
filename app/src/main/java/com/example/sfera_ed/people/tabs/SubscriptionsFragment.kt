package com.example.sfera_ed.people.tabs

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sfera_ed.R
import com.example.sfera_ed.databinding.FragmentSubscribersBinding
import com.example.sfera_ed.databinding.FragmentSubscriptionsBinding
import com.example.sfera_ed.people.adapters.People_adapter
import com.example.sfera_ed.people.models.People
import com.example.sfera_ed.people.storage.PeopleStorage

class SubscriptionsFragment : Fragment() {

    lateinit var bindingClass: FragmentSubscriptionsBinding
    private val adapter_people = People_adapter()
    private val peopleStorage = PeopleStorage()
    private val peopleList = peopleStorage.getSubscriptions()
    private lateinit var tempArrayList : ArrayList<People>
    private var peopleIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        bindingClass = FragmentSubscriptionsBinding.inflate(inflater, container, false)
        Log.i("people", "peopleFragment start")



        bindingClass.apply {
            peopleRCSubscriptions.adapter = adapter_people
            peopleRCSubscriptions.layoutManager = LinearLayoutManager(this@SubscriptionsFragment.context)

            for (p in peopleList) {
                adapter_people.addPeople(p)
            }
        }


        tempArrayList = arrayListOf<People>()
        tempArrayList.addAll(peopleList)

        return bindingClass.root

    }
}