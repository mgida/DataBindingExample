package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databindingexample.adapter.ClothesAdapter
import com.example.databindingexample.databinding.ActivityMainBinding
import com.example.databindingexample.utils.GenerateFakeData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bindingInstance: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


        bindingInstance.recyclerView.layoutManager = LinearLayoutManager(this)
        bindingInstance.recyclerView.setHasFixedSize(true)

        val items = GenerateFakeData.getClothesData(this)

        bindingInstance.adapter = ClothesAdapter(items)


    }
}
