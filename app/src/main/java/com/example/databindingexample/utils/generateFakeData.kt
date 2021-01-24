package com.example.databindingexample.utils

import android.content.Context
import com.example.databindingexample.R
import com.example.databindingexample.model.Clothes

class generateFakeData {


    companion object {

        fun provideClothes(context: Context): List<Clothes> {

            var items: MutableList<Clothes> = ArrayList()
            for (i in 0 until 5) {
                val clothes = Clothes(
                    R.drawable.ic_launcher_background,
                    context.getString(R.string.itemName),
                    context.getString(R.string.colorSize_title),
                    context.getString(R.string.sale_value)
                )
                items.add(clothes)
            }
            return items
        }

    }

}