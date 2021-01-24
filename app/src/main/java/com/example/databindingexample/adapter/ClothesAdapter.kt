package com.example.databindingexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingexample.R
import com.example.databindingexample.model.Clothes

class ClothesAdapter(val clothesItems: List<Clothes>) :
    RecyclerView.Adapter<ClothesAdapter.ClothesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothesViewHolder {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.clothes_list_item, parent, false)
        return ClothesViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ClothesViewHolder, position: Int) {
        val currentItem = clothesItems[position]
        holder.itemImage.setImageResource(currentItem.itemImage)
        holder.itemName.text = currentItem.itemName
        holder.itemColorSize.text = currentItem.itemColorSize
        holder.itemPrice.text = currentItem.itemPrice


    }

    override fun getItemCount() = clothesItems.size


    class ClothesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.imageView)
        val itemName: TextView = itemView.findViewById(R.id.nameTextView)
        val itemColorSize: TextView = itemView.findViewById(R.id.colorTextView)
        val itemPrice: TextView = itemView.findViewById(R.id.priceTextView)

    }


}