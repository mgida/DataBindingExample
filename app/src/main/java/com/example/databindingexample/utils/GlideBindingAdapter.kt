package com.example.databindingexample.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

    @BindingAdapter("imageRes")
    fun loadImage(imageView: ImageView, source: Int) {
        Glide.with(imageView.context).load(source).into(imageView)
    }



