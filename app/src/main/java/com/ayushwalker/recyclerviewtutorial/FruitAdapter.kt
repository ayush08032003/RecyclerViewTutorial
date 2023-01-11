package com.ayushwalker.recyclerviewtutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_fruit.view.*

// RecyclerView.Adapter is a Abstract Class, hence it has own member functions which is needed to be defined at the time of use
// class which defines how items from the array taken and display on the UI Screen.
class FruitAdapter (val fruits: ArrayList<Fruit>) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    // its simply a object that holds the reference to the view
    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    // used to inflate the item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_fruit, parent, false)

        return FruitViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.itemView.tvFruitName.text = fruits[position].name
        holder.itemView.tvOrigin.text = fruits[position].origin
        holder.itemView.tvQuantity.text = fruits[position].quantity.toString()
    }

    // used to tell RecyclerView, how many items created on my screen
    override fun getItemCount(): Int = fruits.size

}