package com.ayushwalker.recyclerviewtutorial

import kotlin.random.Random

data class Fruit(val name:String, val origin: String, val quantity:Int) { // fruit object.
    companion object{ // companion objects works same as static members in Java.

        @JvmField // FruitName for fruits variety, kept in companion object just for easy access of the name array
        val FRUIT_NAME = arrayOf("Apple", "Mango", "PineApple","Strawberry","Guava","Banana","Kiwi", "Grapes")

        @JvmField // collection of origin.
        val ORIGINS = arrayOf("Lucknow", "Nagpur", "Srinagar", "Patna","Mysore")

        @JvmStatic // this annotation has no help on Kotlin, but helps at the time of interrelated use of Kotlin Program into Java.
        fun getRandomFruits(n:Int):ArrayList<Fruit> { // gets randomly selected different types of fruits their origin anf quantity.
            val fruitArray = ArrayList<Fruit>(n)
            for(i in 1 .. n){
                fruitArray.add(Fruit(FRUIT_NAME[Random.nextInt(0,8)],
                    ORIGINS[Random.nextInt(5)], Random.nextInt(1,10)*100))
            }

            return fruitArray
        }
    }
}