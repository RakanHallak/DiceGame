package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*
import kotlin.random.Random

class Game : AppCompatActivity() {

    //var diceImage : ImageView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

    //val rollButton: Button = findViewById(R.id.Button2)
        //rollButton.setOnClickListener {rollDice()}
        //diceImage = findViewById(R.id.imageView)

    }
    var count1=0
    var count2=0
    var count3=0
    var count4=0
    var count5=0
    var count6=0

   fun rollDice(view: View){
        //Toast.makeText(this, "Dice: $randomInt", Toast.LENGTH_SHORT).show()
       //val drawableResource:Unit =
        when(Random.nextInt(6) +1){
            1 -> {
                imageView.setImageResource(R.drawable.d1)
                count1++
                tv1.text="1:$count1"
            }
            2 -> {
                imageView.setImageResource(R.drawable.d2)
                count2++
                tv2.text="2:$count2"
            }
            3 -> {
                imageView.setImageResource(R.drawable.d3)
                count3++
                tv3.text="3:$count3"
            }
            4 -> {
                imageView.setImageResource(R.drawable.d4)
                count4++
                tv4.text="4:$count4"
            }
            5 -> {
                imageView.setImageResource(R.drawable.d5)
                count5++
                tv5.text="5:$count5"
            }
            else -> {
                imageView.setImageResource(R.drawable.d6)
                count6++
                tv6.text="6:$count6"
            }
        }
        //diceImage?.setImageResource(drawableResource)
    }
    fun resetzero(view:View){
        var count1=0;var count2=0;var count3=0;var count4=0 ;var count5=0;var count6=0
        tv1.text="1:$count1"
        tv2.text="2:$count2"
        tv3.text="3:$count3"
        tv4.text="4:$count4"
        tv5.text="5:$count5"
        tv6.text="6:$count6"
    }
}
