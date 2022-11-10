package com.example.sfera_ed.people.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.sfera_ed.people.adapters.People_adapter
import com.example.sfera_ed.people.models.People
import com.example.sfera_ed.people.storage.PeopleStorage

class PeopleViewModel : ViewModel() {
    private val adapter_people = People_adapter()
    private val peopleStorage = PeopleStorage()
//    private val peopleList = peopleStorage.getPeople()

    init {
        Log.i("people", "vm init")
    }

    override fun onCleared() {
        Log.i("people", "vm cleared")
        super.onCleared()
    }

//    fun peopleListStart() : List<People>{
//        for (p in peopleList) {
//            adapter_people.addPeople(p)
//            Log.i("people", "prsn added")
//
//        }
//        return peopleList
//    }

}