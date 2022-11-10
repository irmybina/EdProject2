package com.example.sfera_ed.people


import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.sfera_ed.R

import com.example.sfera_ed.databinding.FragmentPeopleBinding
import com.example.sfera_ed.people.adapters.PeoplePagerAdapter
import com.example.sfera_ed.people.adapters.People_adapter
import com.example.sfera_ed.people.models.People
import com.example.sfera_ed.people.storage.PeopleStorage
import com.google.android.material.tabs.TabLayoutMediator
import java.security.AccessControlContext
import java.security.AccessController
import kotlin.collections.ArrayList

class PeopleFragment : Fragment() {

    lateinit var bindingClass: FragmentPeopleBinding
//    private val adapter_people = People_adapter()
//    private val peopleStorage = PeopleStorage()
////    private val peopleList = peopleStorage.getPeople()
////    private lateinit var tempArrayList : ArrayList<People>
////    private var peopleIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        bindingClass = FragmentPeopleBinding.inflate(inflater, container, false)
        Log.i("people", "peopleFragment start")
        val toolbar = bindingClass.fragmentPeopleToolbar
        if (toolbar != null){
            toolbar.setNavigationOnClickListener{
                Navigation.findNavController(bindingClass.root).navigate(R.id.go_to_profile)
            }
        }
        Log.i("people", "toolbar init")


//        bindingClass.apply {
//            peopleRC.adapter = adapter_people
//            peopleRC.layoutManager = LinearLayoutManager(this@PeopleFragment.context)
//
//            for (p in peopleList) {
//                adapter_people.addPeople(p)
//            }
//        }

        initial()
//        tempArrayList = arrayListOf<People>()
//        tempArrayList.addAll(peopleList)

        return bindingClass.root

    }

    private fun initial() {
        val a : AccessControlContext? = AccessController.getContext()
        bindingClass.peoplePager.adapter = PeoplePagerAdapter(this)
        TabLayoutMediator(bindingClass.peopleTabLayout, bindingClass.peoplePager){
            tab, pos ->
            when(pos){
                0 -> tab.setText("Subscribers")
                1 -> tab.setText("Subscriptions")
                2 -> tab.setText("Mutually")
            }
        }.attach()
    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        inflater.inflate(R.menu.people_menu, menu)
//        val item = menu?.findItem(R.id.app_bar_search)
//        val searchView = item?.actionView as SearchView
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(p0: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(p0: String?): Boolean {
//                tempArrayList.clear()
//                val searchText = p0!!.toLowerCase(Locale.getDefault())
//                if (searchText.isNotEmpty()){
//                    for (p in peopleList){
//                        if (p.name.toLowerCase(Locale.getDefault()).contains(searchText)) tempArrayList.add(p)
//                    }
//                }
//                else {
//                    tempArrayList.clear()
//                    tempArrayList.addAll(peopleList)
//                }
//                adapter_people.notifyDataSetChanged()
//
//                return false
//            }
//
//        })
//
//        super.onCreateOptionsMenu(menu, inflater)
//    }


}