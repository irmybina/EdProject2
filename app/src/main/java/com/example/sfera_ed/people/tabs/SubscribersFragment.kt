package com.example.sfera_ed.people.tabs

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sfera_ed.R
import com.example.sfera_ed.databinding.FragmentPeopleBinding
import com.example.sfera_ed.databinding.FragmentSubscribersBinding
import com.example.sfera_ed.people.adapters.People_adapter
import com.example.sfera_ed.people.models.People
import com.example.sfera_ed.people.storage.PeopleStorage


class SubscribersFragment : Fragment() {


    lateinit var bindingClass: FragmentSubscribersBinding
    private val adapter_people = People_adapter()
    private val peopleStorage = PeopleStorage()
    private val peopleList = peopleStorage.getSubscribers()
    private lateinit var tempArrayList : ArrayList<People>
    private var peopleIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        bindingClass = FragmentSubscribersBinding.inflate(inflater, container, false)
        Log.i("people", "peopleFragment start")



        bindingClass.apply {
            peopleRC.adapter = adapter_people
            peopleRC.layoutManager = LinearLayoutManager(this@SubscribersFragment.context)

            for (p in peopleList) {
                adapter_people.addPeople(p)
            }
        }


        tempArrayList = arrayListOf<People>()
        tempArrayList.addAll(peopleList)

        return bindingClass.root

    }
}