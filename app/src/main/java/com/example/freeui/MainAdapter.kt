package com.example.freeui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.freeui.data.Item
import com.example.freeui.databinding.ItemModelBinding

class MainAdapter : ListAdapter<Item, MainAdapter.MainViewModel>(DiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainViewModel {
        return MainViewModel(
            ItemModelBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainAdapter.MainViewModel, position: Int) {
        holder.bind(getItem(position))
    }


    class DiffUtilCallBack : DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem == newItem
        }
    }

    class MainViewModel(private val binding: ItemModelBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) = with(binding) {
            Glide.with(modelImage)
                .load(item.image)
                .into(modelImage)
            name.text = item.name
            description.text = item.description
            price.text = item.price
        }
    }
}

