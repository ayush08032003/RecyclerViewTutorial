package com.ayushwalker.recyclerviewtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = Fruit.getRandomFruits(100) // gets n number of fruits(constructor) from the Fruit class (check Fruit.kt)
        val fruitAdapter = FruitAdapter(fruits) // makes the custom adapter named FruitAdapter, check FruitAdapter.kt

        rvFruits.layoutManager = LinearLayoutManager(this) // this is the layout manager, which decides the style formatting, ie whether it is in linear
        // format or it is in grid format and all that stuff.
        rvFruits.adapter = fruitAdapter // this just sets the adapter into play.
    }
}