package com.example.sfera_ed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.sfera_ed.databinding.ActivityMainBinding
import com.example.sfera_ed.databinding.FragmentProfileBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ProfileFragment : Fragment() {
    lateinit var bindingClass : FragmentProfileBinding
    private val image = "https://i.pinimg.com/originals/a8/87/03/a8870315e9d5d084722ff9c1ab5d2bee.jpg"
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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        bindingClass = FragmentProfileBinding.inflate(inflater, container, false)

        Glide.with(this)
            .load(image)
            .fitCenter()
            .circleCrop()
            .into(bindingClass.avatar)

        bindingClass.peopleButton.setOnClickListener{
            Navigation.findNavController(bindingClass.root).navigate(R.id.go_to_people)
        }

        bindingClass.apply {
            rcview2.adapter = adapter_chronicles
            rcviewMoments.adapter = adapter_moments
            rcview.adapter = adapter_photoes
            bindingClass.rcview2.layoutManager = GridLayoutManager(this@ProfileFragment.context, 3)

            for (c in chroniclesCardsList){
                adapter_chronicles.addChroniclesCard(Chronicles_card(c))
            }

            for (m in momentList){
                adapter_moments.addMoment(Moment(m))
            }

            for (p in photoesList){
                adapter_photoes.addPhoto(Photo(p))
            }

        }






        return bindingClass.root
    }


}