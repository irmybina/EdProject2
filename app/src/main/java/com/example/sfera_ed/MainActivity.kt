package com.example.sfera_ed

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.SearchView
import com.example.sfera_ed.databinding.ActivityMainBinding
import com.example.sfera_ed.profile.adapters.Chronicles_card_adapter
import com.example.sfera_ed.profile.adapters.Moment_adapter
import com.example.sfera_ed.profile.adapters.Photo_adapter

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding

    private val adapter_chronicles = Chronicles_card_adapter()
    private val chroniclesCardsList = listOf(R.drawable.photo_1_q,
        R.drawable.photo_2_q,
        R.drawable.photo_3_q,
        R.drawable.photo_4_q,
        R.drawable.photo_5_q,
        R.drawable.photo_6_q,
        R.drawable.photo_7_q,
        R.drawable.photo_8_q,
        R.drawable.photo_5_q,
        R.drawable.photo_6_q,
        R.drawable.photo_7_q,
        R.drawable.photo_8_q)
    private var chroniclesCardIndex = 0

    private val adapter_moments = Moment_adapter()
    private val momentList = listOf(
        R.drawable.photo_1_moments,
        R.drawable.photo_2_moments,
        R.drawable.photo_3_moments,
        R.drawable.photo_1_moments,
        R.drawable.photo_2_moments,
        R.drawable.photo_3_moments
        )
    private var momentIndex = 0

    private val adapter_photoes = Photo_adapter()
    private val photoesList = listOf(R.drawable.photo_1,
    R.drawable.photo_2,
    R.drawable.photo_3,
    R.drawable.photo_3)
    private var photoesIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
//
//        chr_card_init()
//        moment_init()
//        photo_init()
//
//
//
//
//
//
//
//
//    private fun chr_card_init(){
//        bindingClass.apply {
//            bindingClass.rcview2.layoutManager = GridLayoutManager(this@MainActivity, 3)
//            rcview2.adapter = adapter_chronicles
////            butt.setOnClickListener {
////                if (chroniclesCardIndex>8) chroniclesCardIndex = 1
////                val chroniclesCard = Chronicles_card(chroniclesCardsList[chroniclesCardIndex])
////                adapter.addChroniclesCard(chroniclesCard)
////                chroniclesCardIndex++
////            }
//        }
//    }
//
//    private fun moment_init(){
//        bindingClass.apply {
////            bindingClass.rcview.layoutManager = LinearLayoutManager(this@MainActivity)
//            rcviewMoments.adapter = adapter_moments
////            rcview_moment.adapter = adapter_moments
////            momentsAdd.setOnClickListener {
////                if (momentIndex>2) momentIndex = 2
////                val moment = Moment(momentList[momentIndex])
////                adapter_moments.addMoment(moment)
////                momentIndex++
////            }
//        }
//    }
//
//    private fun photo_init(){
//        bindingClass.apply {
////            bindingClass.rcview.layoutManager = LinearLayoutManager(this@MainActivity)
//            rcview.adapter = adapter_photoes
////            rcview_moment.adapter = adapter_moments
////            momentsAdd.setOnClickListener {
////                if (momentIndex>2) momentIndex = 2
////                val moment = Moment(momentList[momentIndex])
////                adapter_moments.addMoment(moment)
////                momentIndex++
////            }
//        }

    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//
//        menuInflater.inflate(R.menu.people_menu, menu)
//        val item = menu?.findItem(R.id.app_bar_search)
//        val searchView = item?.actionView as SearchView
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(p0: String?): Boolean {
//                TODO("Not yet implemented")
//            }
//
//            override fun onQueryTextChange(p0: String?): Boolean {
//                TODO("Not yet implemented")
//            }
//
//        })
//
//        return super.onCreateOptionsMenu(menu)
//    }

    public fun getContext() : Context{
        return applicationContext
    }
}