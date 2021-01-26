package com.example.databindingexample.utils

import android.content.Context
import com.example.databindingexample.R
import com.example.databindingexample.model.Clothes

class GenerateFakeData {

    companion object {

        fun getClothesData(context: Context): List<Clothes> = listOf(
            Clothes(
                R.drawable.black_shirt_male,
                context.getString(R.string.itemName),
                context.getString(R.string.colorSize_title1),
                context.getString(R.string.price_value)
            ), Clothes(
                R.drawable.black_shirt_female,
                context.getString(R.string.itemName),
                context.getString(R.string.colorSize_title2),
                context.getString(R.string.price_value)
            ), Clothes(
                R.drawable.white_shirt_male,
                context.getString(R.string.itemName),
                context.getString(R.string.colorSize_title3),
                context.getString(R.string.price_value)
            ), Clothes(
                R.drawable.white_shirt_female,
                context.getString(R.string.itemName),
                context.getString(R.string.colorSize_title4),
                context.getString(R.string.price_value)
            ), Clothes(
                R.drawable.orange_hat,
                context.getString(R.string.itemName),
                context.getString(R.string.colorSize_title1),
                context.getString(R.string.price_value)
            )

        )

    }
}