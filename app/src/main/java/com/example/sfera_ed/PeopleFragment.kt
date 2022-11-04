package com.example.sfera_ed


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.sfera_ed.databinding.FragmentPeopleBinding

class PeopleFragment : Fragment() {

    lateinit var bindingClass: FragmentPeopleBinding
    private val adapter_people = People_adapter()
    private val peopleList = listOf(
        People(
            "Alex Dow",
            "https://static.wikia.nocookie.net/hieloyfuego/images/0/0f/Matt_Smith_como_Daemon_Targaryen_HotD.jpg/revision/latest?cb=20220830123715"
        ),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://startefacts.com/upload//upload/news/317507603735.jpg")
        ,
        People("John Raw", "https://i.insider.com/63565f39390dfe00196d978e?width=700")
        ,
        People("John Raw", "https://i.pinimg.com/originals/f3/b2/b0/f3b2b015270ad22cc3feddaff99b888b.jpg")
        ,
        People("John Raw", "https://www.nastroy.net/pic/images/202008/265310-1596968235.jpg")
        ,
        People("John Raw", "https://cdn.kanobu.ru/articles/pics/2d97e89f-f7a2-4dbd-949e-36ec926ec2ed.webp")
        ,
        People("John Raw", "https://img.gazeta.ru/files3/435/7823435/1-pic4_zoom-1500x1500-42818.jpg")
        ,
        People("John Raw", "https://static.wikia.nocookie.net/gameofthrones/images/f/f4/%D0%A1%D0%B5%D1%80%D1%81%D0%B5%D1%8F_8x04.jpg/revision/latest?cb=20190512124726&path-prefix=ru")
        ,
        People("John Raw", "https://static.kinoafisha.info/k/articles/1200/upload/articles/529431095055.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg"),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg"),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg"),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg"),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg"),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg"),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg"),
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
        ,
        People("John Raw", "https://media.distractify.com/brand-img/jOCLDBn1Q/0x0/daemon-targaryen-hotd-1663511800346.jpg")
    )
    private var peopleIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingClass = FragmentPeopleBinding.inflate(inflater, container, false)

        bindingClass.apply {
            peopleRC.adapter = adapter_people
            peopleRC.layoutManager = LinearLayoutManager(this@PeopleFragment.context)

            for (p in peopleList) {
                adapter_people.addPeople(p)
            }

            return bindingClass.root
        }


    }
}