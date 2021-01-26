package com.example.databindingexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ClothesListItemBinding
import com.example.databindingexample.model.Clothes

class ClothesAdapter(private val clothesItems: List<Clothes>) :
    RecyclerView.Adapter<ClothesAdapter.ClothesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothesViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val clothesListItemBinding: ClothesListItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.clothes_list_item, parent, false)

        return ClothesViewHolder(clothesListItemBinding)
    }


    override fun onBindViewHolder(holder: ClothesViewHolder, position: Int) {
        val currentItem = clothesItems[position]
        holder.clothesListItemBinding.clothes = currentItem

    }

    override fun getItemCount() = clothesItems.size


    class ClothesViewHolder(var clothesListItemBinding: ClothesListItemBinding) :
        RecyclerView.ViewHolder(clothesListItemBinding.root)


}