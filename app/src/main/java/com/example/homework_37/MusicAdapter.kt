package com.example.homework_37

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.homework_37.databinding.ItemMusicBinding

class MusicAdapter(private val musicList: ArrayList<MusicModel>, private val onClick: (position: Int ) -> Unit) : Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = musicList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(musicList[position])
        holder.itemView.setOnClickListener{
            onClick(position)
        }
    }
}

class ViewHolder(private var binding: ItemMusicBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(music: MusicModel) {
        binding.tvName.text = music.name
        binding.tvAuthor.text = music.author
        binding.tvNumber.text = music.number
        binding.tvTime.text = music.time
    }
}