package com.example.homework_37

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_37.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    private val musicList = arrayListOf(
        MusicModel("Blank Space", "Taylor Swift", "3:22", "1"),
        MusicModel("Watch Me", "Silento", "5:36", "2"),
        MusicModel("Earned It", "The Weekend", "4:51", "3"),
        MusicModel("The Hills", "The Weekend", "3:41", "4"),
        MusicModel("Writing’s On The Wall", "Sam Smith", "5:33", "5"),
        MusicModel("Skyfall", "Adele", "4:49", "6"),
        MusicModel("No Time to Die", "Billie Eilish", "3:59", "7"),
        MusicModel("Stay With Me", "Sam Smith", "3:29", "8"),
        MusicModel("Young and Beautiful", "Lana Del Rey", "3:58", "9"),
        MusicModel("Never Gonna Give You Up", "Ric Astley", "3:32", "10"),

    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter = adapter

    }
    private fun onClick(position: Int) {
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("key", musicList[position].name)
        startActivity(intent)
    }
}
